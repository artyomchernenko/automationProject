package tests;

import org.testng.annotations.Test;

public class SearchTests extends BaseTest{
	
	@Test
	//Find MacBook in the search field
	public void tc01_searchForMacBook() {
		mainPage.searchForProduct("MacBook");
		
	}
	@Test
	//Find Iphone in the search field
	public void tc02_searchFoeIphone() {
		mainPage.searchForProduct("Iphone");
	}
	@Test
	//Find Sony product in search field
	public void tc03_searchForSony() {
		mainPage.searchForProduct("Sony");
		
	}

	@Test
	//Search random latters and simbols
	public void tc04_searchForRandomLatters() {
		mainPage.searchForProduct("kajfgshjfghjsgf#$%^&((");
	}
}
