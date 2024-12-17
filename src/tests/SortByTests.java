package tests;

import org.testng.annotations.Test;

public class SortByTests extends BaseTest{

	@Test(description = "Sort laptops by price")
	public void tc01_sortByPrice() {
		mainPage.enterProductsPage("Laptops & Notebooks");
		laptopsAndNotebooksPage.sortLaptops("Price (Low > High)");
		laptopsAndNotebooksPage.sortLaptops("Price (High > Low)");
	}
	
	@Test(description = "Sort laptops by name")
	public void tc02_sortByName() {
		laptopsAndNotebooksPage.sortLaptops("Name (A - Z)");
		laptopsAndNotebooksPage.sortLaptops("Name (Z - A)");
	}
	
	@Test(description = "Sort laptops by raiting")
	public void tc03_sortByRaiting() {
		laptopsAndNotebooksPage.sortLaptops("Rating (Highest)");
		laptopsAndNotebooksPage.sortLaptops("Rating (Lowest)");
	}
	
	@Test(description = "Sort laptops by model")
	public void tc04_sortByModel() {
		laptopsAndNotebooksPage.sortLaptops("Model (A - Z)");
		laptopsAndNotebooksPage.sortLaptops("Model (Z - A)");
	}
	
	@Test(description = "Sort laptops by default")
	public void tc05_sortByDefault() {
		laptopsAndNotebooksPage.sortLaptops("Default");
	}
	
	@Test(description = "Switch to list/grid")
	public void tc06_switchToListGrid() {
		laptopsAndNotebooksPage.switchToList();
		sleep(600);
		laptopsAndNotebooksPage.switchToGrid();
	}
}