package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InspectLaptop extends BaseTest{

	@Test(description = "Choose one laptop(HP LP3065)")
	public void tc01_chooseLaptopToInspect() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("HP LP3065");
		//Validation
		String expected = "HP LP3065";
		String actual = laptopsAndNotebooksPage.laptopModelLable();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "See the photos of laptop(HP LP3065)")
	public void tc02_seeThePhotosofLaptop() {
		laptopPage.seePhotosOfTheLaptop();
		Assert.assertTrue(laptopPage.checkIfPictureIsClickable());
		
	}
	
	@Test(description = "See specification of the laptop(HP LP3065)")
	public void tc03_seeSpecificationOfLaptop() {
		laptopPage.seeSpecification();
		//Validation
		String expected = "Specification";
		String actual = laptopPage.specificationLable();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Write review for laptop(HP LP3065)")
	public void tc04_writeReviewForLaptop() {
		laptopPage.writeReview("Artyom Chernenko", "This is very good computer!");
		//Validation
		String expected = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actual = laptopPage.sentReviewLable();
		Assert.assertEquals(actual, expected);
		
	}
}
