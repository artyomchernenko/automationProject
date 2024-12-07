package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyCartPage extends BasePage{

	public MyCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".buttons.clearfix .pull-right")
	private WebElement checkoutBtn;
	@FindBy(css = "div.panel-heading a")
	private WebElement couponBtn;
	@FindBy(css = "#input-coupon")
	private WebElement couponField;
	@FindBy(css = ".input-group-btn #button-coupon")
	private WebElement applyCouponBtn;

	public void checkOut() {
		waitForElementToBeVisible(checkoutBtn);
		click(checkoutBtn);
	}
	public void useCouponCode(String couponeCode) {
		click(couponBtn);
		fillText(couponField, couponeCode);
		click(applyCouponBtn);
	}
}
