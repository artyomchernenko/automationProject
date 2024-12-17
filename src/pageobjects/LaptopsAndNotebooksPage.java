package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends BasePage{

	public LaptopsAndNotebooksPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".form-group #button-cart")
	private WebElement addToCartBtn;
	@FindBy(css = "#cart-total")
	private WebElement chooseCartBtn;
	@FindBy(css = ".table.table-striped [type='button']")
	private WebElement removeFromCartBtn;
	@FindBy(css = "[name='quantity']")
	private WebElement quantityField;
	@FindBy(css = ".button-group .fa.fa-shopping-cart")
	private WebElement addToCartFewBtn;
	@FindBy(css = ".fa.fa-exchange")
	private WebElement addToComparisonBtn;
	@FindBy(css = "#compare-total")
	private WebElement comperationBtn;
	@FindBy(css = ".btn.btn-danger.btn-block")
	private WebElement removeFromComperationBtn;
	@FindBy(css = "#input-sort")
	private WebElement sortLaptopsField;
	@FindBy(css = ".fa.fa-th-list")
	private WebElement switchToListBtn;
	@FindBy(css = ".fa.fa-th")
	private WebElement switchToGridBtn;
	@FindBy(css = "#content > div > div.col-sm-4 > h1")
	private WebElement laptopModelLable;

	//Sort laptops by price/name/raiting/model
	public void sortLaptops(String sortBy) {
		selectByVisibleText(sortLaptopsField, sortBy);
	}
	
	//Switch to list
	public void switchToList() {
		click(switchToListBtn);
	}
	
	//Switch to grid
	public void switchToGrid() {
		click(switchToGridBtn);
	}
	
	//Choose laptop by model name
	public void chooseLaptop(String name) {
		List <WebElement> list = driver.findElements(By.cssSelector(".caption a"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)){
				click(el);
				break;
			}
		}
	}
	
	//Add laptop to cart by model name
	public void addToCart(String name) {
		List <WebElement> list = driver.findElements(By.cssSelector(".caption a"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)){
				click(el);
				click(addToCartBtn);
				break;
			}
		}
	}
	
	//Remove laptop from the cart
	public void removeFromCart() {
		click(chooseCartBtn);
		waitForElementToBeVisible(removeFromCartBtn);
		click(removeFromCartBtn);
	}
	
	//Add different laptops to the cart
	public void addDifferentLaptopsToCart(String name) {
		List<WebElement> arealist = driver.findElements(By.cssSelector(".product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12"));
		for (WebElement area : arealist) {
			WebElement titleLable = area.findElement(By.cssSelector(".caption a"));
			if (titleLable.getText().equalsIgnoreCase(name)) {
				WebElement addToCart =	area.findElement(By.cssSelector(".button-group"));
				addToCart.click();
				break;
			}
		}
	}
	
	//Choose laptop by model name and remove it from the cart
	public void chooseAndRemoveFromCart(String name){
		click(chooseCartBtn);
		List <WebElement> list = driver.findElements(By.cssSelector("td.text-left > a"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				click(removeFromCartBtn);
				break;
			}
		}
	}
	
	//Remove all laptops one by one from the cart
	public void removeAllDifferentLaptops() {
		click(chooseCartBtn);
		List <WebElement> list = driver.findElements(By.cssSelector("td.text-left > a"));
		for (WebElement el : list) {
			while (el != null) {
				click(removeFromCartBtn);
				sleep(1500);
				click(chooseCartBtn);
				break;
			}
		}
	}
	
	//Add laptop to comparison 
	public void addToComparison(String name) {
		List <WebElement> list = driver.findElements(By.cssSelector(".caption a"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)){
				click(el);
				click(addToComparisonBtn);
				break;
			}
		}
	}
	
	//Add few different laptops to comparison
	public void addDifferentItemsToComparison(String name) {
		List<WebElement> arealist = driver.findElements(By.cssSelector(".product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12"));
		for (WebElement area : arealist) {
			WebElement titleLable = area.findElement(By.cssSelector(".caption a"));
			if (titleLable.getText().equalsIgnoreCase(name)) {
				WebElement addToComparison = area.findElement(By.cssSelector("[data-original-title='Compare this Product']"));
				addToComparison.click();
				break;
			}
		}
	}
	
	//Enter comparison page
	public void enterComparisonPage() {
		click(comperationBtn);
	}
	
	//Validation
	public String laptopModelLable() {
		return getText(laptopModelLable);
	}
}