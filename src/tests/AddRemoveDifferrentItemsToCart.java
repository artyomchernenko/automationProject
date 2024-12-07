package tests;

import org.testng.annotations.Test;

import pageobjects.LaptopsAndNotebooksPage;
import pageobjects.MainPage;

public class AddRemoveDifferrentItemsToCart extends BaseTest{

	@Test
	//Add 2 different laptops(Sony VAIO and MacBook Air)at the same time to the Cart
	public void tc01_addFewLaptops(){
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentItemsToCart("Sony VAIO");
		laptopsAndNotebooksPage.addDifferentItemsToCart("MacBook Air");
	}
	@Test
	//Remove one choosen laptop(MacBook Air) from the Cart
	public void tc02_removeChosenLaptopFromCart() {
		laptopsAndNotebooksPage.chooseAndRemoveFromCart("MacBook Air");
	}
	@Test
	//Add all laptops the Cart(at the same time)
	public void tc03_addAllDifferentLaptops() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentItemsToCart("HP LP3065");
		laptopsAndNotebooksPage.addDifferentItemsToCart("MacBook");
		laptopsAndNotebooksPage.addDifferentItemsToCart("MacBook Air");
		laptopsAndNotebooksPage.addDifferentItemsToCart("MacBook Pro");
		laptopsAndNotebooksPage.addDifferentItemsToCart("Sony VAIO");
	}
	@Test
	//Remove all different laptops
	public void tc04_removeAllDifferentLaptopsFromCart() {
		laptopsAndNotebooksPage.removeAllDifferentLaptops();
	}

}
