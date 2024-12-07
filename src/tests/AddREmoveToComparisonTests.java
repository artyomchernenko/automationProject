package tests;

import org.testng.annotations.Test;

public class AddREmoveToComparisonTests extends BaseTest{

	@Test
	//Add one laptop (HP LP3065) to comparison
	public void tc01_addOneLaptopToComparison() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addToComparison("MacBook");
	}
	@Test
	//Choose and remove laptop from the comparison
	public void tc02_removeChosenLaptopFromCoparison() {
		laptopPage.enterComparisonPage();
		productComparisonPage.chooseAndRemoveFromComperation("MacBook");
	}

	@Test
	//Add 2 different laptops to comparison
	public void tc03_addTwoDifferentLaptopsToComparison() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentItemsToComparison("HP LP3065");
		laptopsAndNotebooksPage.addDifferentItemsToComparison("MacBook");
	}
	@Test
	//Remove all laptops from comparation
	public void tc04_removeAllLaptopsFromComparation() {
		laptopsAndNotebooksPage.enterComportionPage();
		productComparisonPage.removeAllDifferentLaptopsFromComperation();
	}
}
