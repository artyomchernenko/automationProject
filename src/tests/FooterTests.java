package tests;

import org.testng.annotations.Test;

import pageobjects.MainPage;

public class FooterTests extends BaseTest{
	
	@Test
	//Click on About Us
	public void tc01_choseAboutUs() {
	mainPage.choseAboutUs();
	}
	
	@Test
	//Click on Choose Delivery Information
	public void tc02_choseDeliveryInformation() {
	mainPage.choseDeliveryInformation();
	}
	
	@Test
	//Click on Privacy Policy
	public void tc03_chosePrivacyPolicy() {
	mainPage.chosePrivacyPolicy();
	}
	
	@Test
	//Click on Term Conditions
	public void tc04_coseTermConditions() {
	mainPage.choseTermsConditions();
	}


}
