package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = ".fa.fa-user")
	private WebElement accountBtn;
	@FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a")
	private WebElement loginBtn;
	@FindBy(css = "li.dropdown.open > div > a")
	private WebElement chooseFromDDMenu;
	@FindBy(css = "[name='search']")
	private WebElement searchField;
	@FindBy(css = ".btn.btn-default.btn-lg")
	private WebElement searchBtn;
	@FindBy(css = "body > footer > div > div > div:nth-child(1) > ul > li:nth-child(1) > a")
	private WebElement aboutUsBtn;
	@FindBy(css = "body > footer > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")
	private WebElement deliveryInformationBtn;
	@FindBy(css = "body > footer > div > div > div:nth-child(1) > ul > li:nth-child(3) > a")
	private WebElement privacyPolicyBtn;
	@FindBy(css = "body > footer > div > div > div:nth-child(1) > ul > li:nth-child(4) > a")
	private WebElement termsConditionsBtn;
	@FindBy(css = ".fa.fa-phone")
	private WebElement contactUsBtn;
	@FindBy(css = "#input-name")
	private WebElement yourNameField;
	@FindBy(css = "#input-email")
	private WebElement eMailField;
	@FindBy(css = "#input-enquiry")
	private WebElement enquiryMsgField;
	@FindBy(css = ".btn.btn-primary")
	private WebElement submitContactUsBtn;


	public void EnterLoginPage() {
		click(accountBtn);
		click(loginBtn);
	}

	public void enterProductsPage(String name) {
		List <WebElement> list = driver.findElements(By.cssSelector(".dropdown-toggle"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				click(el);
				click(chooseFromDDMenu);
				break;	
			}
		}
	}
	public void fillContactUsForm(String yourName, String eMail, String enquiryText) {
		click(contactUsBtn);
		fillText(yourNameField, yourName);
		fillText(eMailField, eMail);
		fillText(enquiryMsgField, enquiryText);
		click(submitContactUsBtn);
		
		
	}
	public void searchForProduct(String searchText) {
		fillText(searchField, searchText);
		click(searchBtn);
	}
	public void choseAboutUs() {
		click(aboutUsBtn);
		
	}
	public void choseDeliveryInformation() {
		click(deliveryInformationBtn);
		
	}
	public void chosePrivacyPolicy() {
		click(privacyPolicyBtn);
		
	}
	public void choseTermsConditions() {
		click(termsConditionsBtn);
		
	}
	
}
