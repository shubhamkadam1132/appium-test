import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Calculator {

        static AppiumDriver driver;

        @BeforeClass
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
                openCalculator ();
            } catch (Exception exp) {
                System.out.println(exp.getCause());
                System.out.println(exp.getMessage());
                exp.printStackTrace();
            }
        }

        @Test
        public static void openCalculator () throws Exception {

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

            driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);

            //Sagesurfer emulator

            //driver.hidekeyboard();

            System.out.println("current keybord status" + driver.isBrowser());


            //calculator
            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_7")).click();

            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_jia")).click();

            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_3")).click();

            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_deng")).click();


            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_jia")).click();

            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_5")).click();
            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_5")).click();


            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_chu")).click();

            driver.findElement(By.id("com.ulsumobile.calculator:id/iv_deng")).click();


        }



        }
