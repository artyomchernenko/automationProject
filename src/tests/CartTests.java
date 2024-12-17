package tests;

import org.testng.annotations.Test;

public class CartTests extends BaseTest{

	@Test(description = "Enter coupone number")
	public void tc01_enterCouponNumber() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("HP LP3065");
		laptopPage.addToCart();
		laptopPage.openCart();
		myCartPage.useCouponCode("12234576");
	}

	@Test(description = "Estiminate Shipping & Taxes")
	public void tc02_estiminateShipsTaxes() {
		myCartPage.estimateShippingTaxes("Israel", "Tel Aviv (Gosh Dan)", "0000");
	}

	@Test(description = "Enter Gift Certificate")
	public void tc03_enterGiftCertificate() {
		myCartPage.useGiftCertificate("4567890");
	}

	@Test(description = "Change quantity in the cart")
	public void tc04_changeQuantityInTheCart() {
		myCartPage.changeQuantityInTheCart("5");
	}
	@Test(description = "Remove laptop from the Cart")
	public void tc05_removeFromCart() {
		myCartPage.removeFromTheCart();
	}
}
