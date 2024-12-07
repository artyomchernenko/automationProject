package tests;

import org.testng.annotations.Test;

import pageobjects.LaptopsAndNotebooksPage;
import pageobjects.MainPage;

public class AddRemoveSameItemToCartTests extends BaseTest{

	@Test
	//Choose laptop(MacBook Air)
	public void tc01_chooseLaptop() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("MacBook Air");
	}
	@Test
	//Add one laptop(Macbook Air) to the cart
	public void tc02_addToCartLaptop() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addToCart("MacBook Air");
	}
	@Test
	//Remove one laptop from cart(simple)
	public void tc03_removeLaptopFromCart() {
		laptopsAndNotebooksPage.removeFromCart();
	}
	
	@Test
	//Add 3 same laptops(MacBook) to the cart
	public void tc04_add3SameLaptopsToCart() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.chooseLaptop("MacBook");
		laptopPage.chooseQuantityOfLaptops("3");
		laptopPage.addToCart();
	}
	@Test
	//Remove all laptops from the cart(simple)
	public void tc05_removeAllSameFromCart() {
		laptopsAndNotebooksPage.removeFromCart();
	}

}
