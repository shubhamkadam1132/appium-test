package appimtests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Annotations {

	
	@BeforeSuite 
	public void bs() {
		System.out.println("Before suit method ");
	
	}
	@BeforeClass 
	public void bc() {
		System.out.println("Before class method ");
		
	}
		
	@BeforeMethod 
	public void bm() {
		System.out.println("Before method method");
		
		
		
		
}
}