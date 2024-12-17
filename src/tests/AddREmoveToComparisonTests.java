package tests;

import org.testng.annotations.Test;

public class AddREmoveToComparisonTests extends BaseTest{

	@Test(description = "Add one laptop (HP LP3065) to comparison")
	public void tc01_addOneLaptopToComparison() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addToComparison("MacBook");
	}
	
	@Test(description = "Choose and remove laptop from the comparison")
	public void tc02_removeChosenLaptopFromCoparison() {
		laptopPage.enterComparisonPage();
		productComparisonPage.chooseAndRemoveFromComperation("MacBook");
	}
	
	@Test(description = "Add 2 different laptops to comparison")
	public void tc03_addTwoDifferentLaptopsToComparison() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.addDifferentItemsToComparison("HP LP3065");
		laptopsAndNotebooksPage.addDifferentItemsToComparison("MacBook");
	}
	
	@Test(description = "Remove all laptops from comparation")
	public void tc04_removeAllLaptopsFromComparation() {
		laptopsAndNotebooksPage.enterComparisonPage();
		productComparisonPage.removeAllDifferentLaptopsFromComperation();
	}
}
