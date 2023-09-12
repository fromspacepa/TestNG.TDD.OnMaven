 package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePassword_HappyPath {
    //Adding the tag "priority" such as following, will priorities the test case. 
	//This following test case will get executed at first, based on priority as it is priorities as: priority = 1
	@Test(priority = 1, groups = "login")
	public void pre_condition1_CreatingAccount() {
		System.out.println("succesfully create an account");
	}
    //Secondly this following case will get executed, based on priority as it is priorities as: priority = 2
	@Test(priority = 2, groups = "login")
	public void pre_condition2_LogingIn() {
		System.out.println("succesfully login to the account");
	}
    //This following test case will get executed after above two case, based on priority as it is priorities as: priority = 3
	@Test(priority = 3, groups = "login")
	public void condition_ChangingPassword() {
		System.out.println("succesfully change the password");
		System.out.println("Login again and verify the password is changed");
		Assert.assertTrue(false);
	}

}
