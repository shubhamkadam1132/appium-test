import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//  static AppiumDriver driver;


import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LoginPage {

    static AppiumDriver driver;

    @BeforeClass
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

    @Test(priority = 1)

    public static void openSagesurfer() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator");

        //for hiding keybored
        cap.setCapability("connectHardwareKeyboard", false);

        //cap.setCapability("udid","emulator-5554"); //emulator
        cap.setCapability("udid", "520044c6fe3a3573");

        //cap.setCapability("udid","R9PT50F4ZZB");//android Tab

        cap.setCapability("platformName", "Android");

        cap.setCapability("appium:app", "C:\\\\Apk\\\\Sagesurfer.apk");

        //cap.setCapability("appium:app","C:\\Apk\\calculator.apk");
        //cap.setCapability("platformVersion","09"); //emulator

        cap.setCapability("platformVersion", "09");///samsung

        cap.setCapability("automationName", "UiAutomator1");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        /// pass the appium any driver

        driver = new AppiumDriver(url, cap);

        //Print the satement

        System.out.println("Application Started...");

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        //Sagesurfer emulator

        //driver.hidekeyboard();
        //System.out.println("current keybord status" + driver.isBrowser());

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_name")).sendKeys("shubhamk");


        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_password")).sendKeys("Sag@!nd!1");
//
        //Eye Button

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/text_input_end_icon")).click();


        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_server_code")).sendKeys("sage006");
        //Remember Me

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/saveLoginCheckBox")).click();


        // click on Login

        driver.findElement(By.id("com.sagesurfer.collaborativecares:id/button_login")).click();


        //Close the app

        //logout  the app
    }






@Test(priority = 0)

    void test1() {
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

}
        // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[14]/android.widget.RelativeLayout/android.widget.TextView")).click();



        @AfterTest()


        public void tearDown ()throws Exception {


            driver.quit();

        }
    }

