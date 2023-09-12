package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGBasicTestCase {

	
	@Test
	public void logining_inTotheApp_HappyPath() {
		System.out.println("run the pre hooks to open and set browser and time");
		System.out.println("go to the home page");
		System.out.println("valid / active enter user");
		System.out.println("valid / active enter pass");
		System.out.println("click on sign in");
		System.out.println("assert to make sure the user is signed in");
	}
	
	@Test
	public void f2() {
		System.out.println("this is the test method2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method will be executed before each method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this method will be executed after each method");
	}

}
