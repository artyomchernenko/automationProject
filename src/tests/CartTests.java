package tests;

import org.testng.annotations.Test;

public class CartTests extends BaseTest{
	
	@Test
	//Enter coupone number
	public void tc01_enterCouponNumber() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("HP LP3065");
		laptopPage.addToCart();
		laptopPage.openCart();
		myCartPage.useCouponCode("12234576");
	}

}
