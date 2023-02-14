import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginPage {

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


       // cap.setCapability("udid", "520044c6fe3a3573");

        cap.setCapability("udid","R9PT50F4ZZB");//Shubham


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

        //Thread.sleep(9990000);
        //calculator
	/*driver.findElement(By.id("com.ulsumobile.calculator:id/iv_7")).click();

	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_jia")).click();

	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_3")).click();

	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_deng")).click();


	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_jia")).click();

	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_5")).click();
	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_5")).click();


	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_chu")).click();

	driver.findElement(By.id("com.ulsumobile.calculator:id/iv_deng")).click();*/

        //Sagesurfer emulator

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_name")).sendKeys("shubhamk");


        //driver.hidekeyboard();
        System.out.println("current keybord status" + driver.isBrowser());


        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_name")).sendKeys("shubhamk");

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_password")).sendKeys("Sag@!nd!1");

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_server_code")).sendKeys("sage006");
        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/button_login")).click();

        driver.quit();





    }
}