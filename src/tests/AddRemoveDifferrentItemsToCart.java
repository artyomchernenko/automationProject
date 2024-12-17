package tests;

import org.testng.annotations.Test;

public class AddRemoveDifferrentItemsToCart extends BaseTest{

	@Test(description = "Add 2 different laptops(Sony VAIO and MacBook Air)at the same time to the cart")
	public void tc01_addFewLaptops(){
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("Sony VAIO");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("MacBook Air");
	}
	
	@Test(description = "Remove one chosen laptop(MacBook Air) from the cart")
	public void tc02_removeChosenLaptopFromCart() {
		laptopsAndNotebooksPage.chooseAndRemoveFromCart("MacBook Air");
	}
	
	@Test(description = "Add all laptops the cart(at the same time)")
	public void tc03_addAllDifferentLaptops() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("HP LP3065");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("MacBook");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("MacBook Air");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("MacBook Pro");
		laptopsAndNotebooksPage.addDifferentLaptopsToCart("Sony VAIO");
	}
	
	@Test(description = "Remove all different laptops")
	public void tc04_removeAllDifferentLaptopsFromCart() {
		laptopsAndNotebooksPage.removeAllDifferentLaptops();
	}

}
