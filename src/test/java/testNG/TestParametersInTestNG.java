  package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;

public class TestParametersInTestNG extends Base{

	@Test
	@Parameters("p1")//Example of passing single parameter.
	//@Parameters({"p1", "p2"})//Example of passing two parameters.
	public void testMethod1(String p1) {
		
		System.out.println("method 1 in TestParametersInTestNG");
		System.out.println("This is the value of the parameter: " + p1);
	}
}
