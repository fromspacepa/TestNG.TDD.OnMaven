 package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependenciesInTestNG {

	public int sum(int a, int b) {
		return a - b;
	}

	@Test(priority = 1)
	public void test_sum() {
		
		int actual = sum(10, 10);
		int expected = 20;

		System.out.println("testing sum --- expected: " + expected + " actual: " + actual);

		SoftAssert softaOBJ = new SoftAssert();

		softaOBJ.assertEquals(actual, expected);

		System.out.println("this is after the soft assert &&& before the hard assert");

		boolean result = actual == expected ? true : false;
//		Assert.assertEquals(actual, expected);
		Assert.assertTrue(result);

		System.out.println("testing sum --- this is after the assertion");
		System.out.println("testing sum --- this is after the assertion");
		System.out.println("testing sum --- this is after the assertion");

		softaOBJ.assertAll();

//		Assert.assertEquals(sum(10, 10), 20);

//		if(actual == expected) {
//			System.out.println("function sum works correctly!");
//		} else {
//			System.out.println("function sum is not working correctly!");
//		}
	}

	@Test(priority = 1)
	public void login_in() {
		System.out.println("test1");

	}

	@Test(priority = 2, dependsOnMethods = "login_in")
	public void check_profileImg() {
		System.out.println("test2");
	}
}
