

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

    public class Forget_PassWord {

        static AppiumDriver driver;

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
                openSagesurfer();
            } catch (Exception exp) {
                System.out.println(exp.getCause());
                System.out.println(exp.getMessage());
                exp.printStackTrace();
            }
        }

        public static void openSagesurfer() throws Exception {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "emulator");
            //cap.setCapability("udid","emulator-5554"); //emulator


            //for hiding keybored
            cap.setCapability("connectHardwareKeyboard", false);


            cap.setCapability("udid", "520044c6fe3a3573");

            //cap.setCapability("udid","R9PT50F4ZZB");//android Tab


            cap.setCapability("platformName", "Android");

            cap.setCapability("appium:app", "C:\\\\Apk\\\\Sagesurfer.apk");

            //cap.setCapability("appium:app","C:\\Apk\\calculator.apk");
            //cap.setCapability("platformVersion","09"); //emulator

            cap.setCapability("platformVersion", "09");///samsung

            cap.setCapability("automationName", "UiAutomator1");
            //cap.setCapability("appPackage","com.android.contacts");
            //cap.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");


            //cap.setCapability("appPackage","com.ulsumobile.calculator");
            //cap.setCapability("appActivity","com.ulsumobile.calculator.activity.MainActivity");


            //cap.setCapability("appPackage","com.sagesurfer.collaborativecares");
//	cap.setCapability("appActivity","com.sagesurfer.collaborativecares.MainActivity");
            //cap.setCapability("noReset", "true");



   /* DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:platformVersion", "09");
    desiredCapabilities.setCapability("appium:deviceName", "emulator");
    desiredCapabilities.setCapability("appium:automationName", "UiAutomator1");
    desiredCapabilities.setCapability("appium:udid", "emulator-5554");
    desiredCapabilities.setCapability("appium:appPackage", "com.android.contacts");
    desiredCapabilities.setCapability("appium:appActivity", "com.android.contacts.activities.PeopleActivity");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);*/


            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            /// pass the appium any driver


            driver = new AppiumDriver(url, cap);

            System.out.println("Application Started...");

            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


            //Sagesurfer emulator


            //driver.hidekeyboard();
            System.out.println("current keybord status" + driver.isBrowser());


            driver.findElement(By.id("com.sagesurfer.collaborativecares:id/textview_login_forgot_password")).click();

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();

//Pass the code

            //driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")).sendKeys("sage006");

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_forgot_password_fragment_registered_email")).sendKeys("anup1111@yopmail.com");


        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_forgot_password_fragment_username")).sendKeys("anup1111");


        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_forgot_password_fragment_security_answer")).sendKeys("sage");

//Passing the Captcha In
        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_forgot_password_fragment_captcha_answer")).sendKeys("Tyov");


            driver.findElement(By.id("com.sagesurfer.collaborativecares:id/btn_submit")).click();


        }
    }