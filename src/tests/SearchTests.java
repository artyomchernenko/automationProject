package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest{

	@Test(description = "Find 'MacBook' in the search field")
	public void tc01_searchForMacBook() {
		mainPage.searchForProduct("MacBook");
		//Validation
		String expected = "Search - MacBook";
		String actual = mainPage.searchMacbookLable();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Find 'Iphone' in the search field")
	public void tc02_searchFoeIphone() {
		mainPage.searchForProduct("Iphone");
		//Validation
		String expected = "Search - Iphone";
		String actual = mainPage.searchIphoneLable();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Find 'Sony' in search field")
	public void tc03_searchForSony() {
		mainPage.searchForProduct("Sony");
		//Validation
		String expected = "Search - Sony";
		String  actual = mainPage.searchSonyLable();
	}
	
	@Test(description = "Search for random latters and simbols")
	public void tc04_searchForRandomLatters() {
		mainPage.searchForProduct("kajfgshjfghjsgf#$%^&((");
		//Validation
		String expected = "Search - kajfgshjfghjsgf#$%^&((";
		String actual = mainPage.searchRandomText();
		Assert.assertEquals(actual, expected);
	}
}
