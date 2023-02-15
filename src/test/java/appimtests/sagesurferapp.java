package appimtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sagesurferapp {

	
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

	@Test(priority = 0)

public static void openSagesurfer() throws Exception { 
	
	DesiredCapabilities cap = new DesiredCapabilities();
	 cap.setCapability("deviceName","emulator");
	 //cap.setCapability("udid","emulator-5554"); //emulator
	 
	 


	 cap.setCapability("udid","520044c6fe3a3573");

	//cap.setCapability("udid","5P4TX8IFSWB6DAMN");//Shubham



	 cap.setCapability("platformName","Android");
	 
	 cap.setCapability("appium:app","C:\\\\Apk\\\\Sagesurfer.apk");
	 
	//cap.setCapability("appium:app","C:\\Apk\\calculator.apk");
	 //cap.setCapability("platformVersion","09"); //emulator
	 
	 cap.setCapability("platformVersion","09");///samsung
	 
	 cap.setCapability("automationName","UiAutomator1");
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
	 
	
	
	URL url= new URL("http://127.0.0.1:4723/wd/hub");
	
	/// pass the appium any driver 
	
	
	driver = new AppiumDriver(url ,cap);
	
	System.out.println("Application Started...");
	
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


	
	//login

	//driver.hidekeyboard();

	System.out.println("current keybord status"+driver.isBrowser());

//for hiding keybored

		cap.setCapability("connectHardwareKeyboard", false);






		driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_name")).sendKeys("shubhamk");
	
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_user_password")).sendKeys("Sag@!nd!1");
	
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_login_server_code")).sendKeys("sage006");
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/button_login")).click();
	
	//invite friend
	
	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();




	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.RelativeLayout/android.widget.TextView")).click();
	
	
	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")).sendKeys("komalcc");
	
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/invite_user_btn")).click();
	
	
	//radio button
	


	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/new_user_radio_btn")).click();
	
	//invite new  user


	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.EditText")).sendKeys("vinay");
	
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/team_email_id_txt")).sendKeys("shubham55@yopmail.com");
	
	// click on new user 
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/invite_user_btn")).click();




	//pending invites
	
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/pending_btn")).click();


	// search button

	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/edittext_search")).sendKeys("shubham");


	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/imagebutton_search")).click();

// filter
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/notification_filter")).click();
	
//Start date

	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/start_date_txt")).click();


//	driver.findElement(By.xpath("//android.view.View[@content-desc=\"02 February 2023\"]")).click();



	driver.findElement(By.id("android:id/button1")).click();



//End date


	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/end_date_txt")).click();

	//driver.findElement(By.xpath("//android.view.View[@content-desc=\"13 February 2023\"]")).click();


	driver.findElement(By.id("android:id/button1")).click();




// clear secton


	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/clear_selection_date")).click();



//Start date

	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/start_date_txt")).click();


	//driver.findElement(By.xpath("//android.view.View[@content-desc=\"02 February 2023\"]")).click();



	driver.findElement(By.id("android:id/button1")).click();


//End date


	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/end_date_txt")).click();

	//driver.findElement(By.xpath("//android.view.View[@content-desc=\"13 February 2023\"]")).click();


	driver.findElement(By.id("android:id/button1")).click();






// done button
	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/imageview_toolbar_save")).click();


//back previous button


	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

// Go to Home

	driver.findElement(By.id("com.sagesurfer.collaborativecares:id/textviewhome")).click();








	Thread.sleep(9990000);

	// 	close the application
	driver.quit();

}
} 

	
