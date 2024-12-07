package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#input-email")
	private WebElement userNameField;
	@FindBy(css = "#input-password")
	private WebElement passwordField;
	@FindBy(css = "[value='Login']")
	private WebElement submitBtn;
	@FindBy(css = ".fa.fa-user")
	private WebElement accountBtn;
	@FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")
	private WebElement logoutBtn;
	@FindBy(css = ".alert.alert-danger.alert-dismissible")
	private WebElement LoginErrorMsg;

	public void login(String username, String password) {
		fillText(userNameField, username);
		fillText(passwordField, password);
		click(submitBtn);
	}

	public void logout() {
		click(accountBtn);
		click(logoutBtn);

	}
	public void PrintLoginErrorMessage() {
		if (LoginErrorMsg.getText().equalsIgnoreCase("Warning: No match for E-Mail Address and/or Password.")) {
			System.out.println("Warning: No match for E-Mail Address and/or Password. The Test Passed!!!");

		}
	}

}
