package tests;

import org.testng.annotations.Test;

public class InspectLaptop extends BaseTest{

	@Test
	//Choose one laptop (HP LP3065) 
	public void tc01_chooseLaptopToInspect() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("HP LP3065");;
	}

	@Test
	//See the photos of laptop(HP LP3065)
	public void tc02_seeThePhotosofLaptop() {
		laptopPage.seePhotosOfTheLaptop();
	}

	@Test
	//See Specification of the laptop (HP LP3065)
	public void tc03_seeSpecificationOfLaptop() {
		laptopPage.seeSpecification();
	}

	@Test
	//Write review for laptop (HP LP3065)
	public void tc04_writeReviewForLaptop() {
		laptopPage.writeRevew("Artyom Chernenko", "This is very good computer!");
	}
}
