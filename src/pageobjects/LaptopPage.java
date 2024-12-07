package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage{

	public LaptopPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "#input-quantity")
	private WebElement quantityField;
	@FindBy(css = "#button-cart")
	private WebElement addToCartBtn;
	@FindBy(css = "#cart-total")
	private WebElement clickOnCart;
	@FindBy(css = ".text-right a .fa.fa-shopping-cart")
	private WebElement clickOnViewCart;
	@FindBy(css = "#input-option225")
	private WebElement deliveryDateField;
	@FindBy(css = "ul.thumbnails > li:nth-child(1) > a > img")
	private WebElement pictureBtn;
	@FindBy(css = "[title='Next (Right arrow key)']")
	private WebElement rightArrowBtn;
	@FindBy(css = ".mfp-close")
	private WebElement closePhotosBtn;
	@FindBy(css = "ul.nav.nav-tabs > li:nth-child(2) > a")
	private WebElement seeSpecificationBtn;
	@FindBy(css = "ul.nav.nav-tabs > li:nth-child(3) > a")
	private WebElement revewsBtn;
	@FindBy(css = "#input-name")
	private WebElement yourNameField;
	@FindBy(css = "#input-review")
	private WebElement yourReviewField;
	@FindBy(css = "[value='5']")
	private WebElement rateBtn5;
	@FindBy(css = ".buttons.clearfix #button-review")
	private WebElement SendReviewBtn;
	@FindBy(css = "div.alert.alert-success.alert-dismissible > a:nth-child(3)")
	private WebElement enterCoparisonBtn;

	public void chooseQuantityOfLaptops(String quantity) {
		highlightElement(quantityField, "yellow");
		quantityField.clear();
		quantityField.sendKeys(quantity);

	}

	public void chooseDeliveryDate(String deliveryDate) {
		highlightElement(quantityField, "yellow");
		deliveryDateField.clear();
		deliveryDateField.sendKeys(deliveryDate);
	}

	public void addToCart() {
		click(addToCartBtn);
	}

	public void openCart() {
		click(clickOnCart);
		click(clickOnViewCart);
	}
	public void seePhotosOfTheLaptop() {
		click(pictureBtn);
		sleep(1000);
		click(rightArrowBtn);
		sleep(1000);
		click(rightArrowBtn);
		sleep(1000);
		click(rightArrowBtn);
		click(closePhotosBtn);
	}
	public void seeSpecification() {
		click(seeSpecificationBtn);

	}
	public void writeRevew(String yourName, String reviewText) {
		click(revewsBtn);
		fillText(yourNameField, yourName);
		sleep(700);
		fillText(yourReviewField, reviewText);
		sleep(700);
		click(rateBtn5);
		sleep(700);
		click(SendReviewBtn);
	}
	public void enterComparisonPage() {
		click(enterCoparisonBtn);

	}

}

