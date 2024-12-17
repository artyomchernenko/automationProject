package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

	@Test(description = "Login with valid user name and password")
	public void tc01_loginValid(){
		mainPage.EnterLoginPage();
		loginPage.login("aptem1986@mail.ru", "Onlyforproject");
		//Validation
		String expected = "My Account";
		String actual = loginPage.getValidLginLable();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Logout the system")
	public void tc02_logout() {
		loginPage.logout();
		//Validation
		String expected = "Account Logout";
		String actual = loginPage.getValidLogoutLable();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Login with invalid username and password")
	public void tc03_loginInvalid() {
		mainPage.EnterLoginPage();
		loginPage.login("ApTeM", "12345678");
		//Validation
		String expected = "Warning: No match for E-Mail Address and/or Password.";
		String actual = loginPage.getInvalidErrorLable();
		Assert.assertEquals(actual, expected);
	}
}
