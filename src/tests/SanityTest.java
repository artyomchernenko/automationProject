package tests;

import org.testng.annotations.Test;

public class SanityTest extends BaseTest{

	@Test
	//Login system, add product to the cart, fill your personal information, make an order.
	public void tc01_sanity() {
		mainPage.EnterLoginPage();
		loginPage.login("aptem1986@mail.ru", "Onlyforproject");
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("HP LP3065");
		laptopPage.seePhotosOfTheLaptop();
		laptopPage.seeSpecification();
		laptopPage.writeRevew("Artyom Chernenko", "This is very good computer!!!");
		laptopPage.chooseDeliveryDate("2025-04-11");
		laptopPage.chooseQuantityOfLaptops("3");
		laptopPage.addToCart();
		laptopPage.openCart();
		myCartPage.checkOut();
		checkOutPage.fillBillingDetails("Artyom", "Chernenko", "Atsmaut", "Bat-Yam", "0000", "Israel", "Tel Aviv (Gosh Dan)");
		checkOutPage.fillDeliveryDetails("Artyom", "Chernenko", "Atsmaut", "Bat-Yam", "0000", "Israel", "Tel Aviv (Gosh Dan)");
		checkOutPage.fillMesageDeliveryField("Please deliver faster!!!");
		checkOutPage.agreeToTheTermsAndConditions();
		checkOutPage.confirmOrder();
	}

}
