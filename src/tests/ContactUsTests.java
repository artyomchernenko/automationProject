package tests;

import org.testng.annotations.Test;

public class ContactUsTests extends BaseTest{
	

	@Test 
	//Fill the Contact Us Form
	public void tc01_fillTheContuctUsForm() {
		mainPage.fillContactUsForm("Artyom", "aptem1986@mail.ru", "Your Site Is good!!!");
	}

}
