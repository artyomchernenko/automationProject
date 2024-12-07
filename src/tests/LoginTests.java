package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.MainPage;

public class LoginTests extends BaseTest{

	@Test
	//Login with valid user name and password
	public void tc01_login(){
		mainPage.EnterLoginPage();
		loginPage.login("aptem1986@mail.ru", "Onlyforproject");
	}


	@Test
	//Logout the system
	public void tc02_logout() {
		loginPage.logout();
	}


	@Test
	//Login with invalid username and password
	public void tc03_loginIncorrect() {
		mainPage.EnterLoginPage();
		loginPage.login("ApTeM", "12345678");
		loginPage.PrintLoginErrorMessage();
	}
}
