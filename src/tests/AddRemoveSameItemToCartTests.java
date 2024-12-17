package tests;

import org.testng.annotations.Test;

public class AddRemoveSameItemToCartTests extends BaseTest{

	@Test(description = "Choose laptop(MacBook Air)")
	public void tc01_chooseLaptop() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("MacBook Air");
	}

	@Test(description = "Add one laptop(Macbook Air) to the cart")
	public void tc02_addToCartLaptop() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addToCart("MacBook Air");
	}

	@Test(description = "Remove one laptop from cart")
	public void tc03_removeLaptopFromCart() {
		laptopsAndNotebooksPage.removeFromCart();
	}

	@Test(description = "Add 3 same laptops(MacBook) to the cart")
	public void tc04_add3SameLaptopsToCart() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("MacBook");
		laptopPage.chooseQuantityOfLaptops("3");
		laptopPage.addToCart();
	}

	@Test(description = "Remove all laptops from the cart")
	public void tc05_removeAllSameFromCart() {
		laptopsAndNotebooksPage.removeFromCart();
	}
}
