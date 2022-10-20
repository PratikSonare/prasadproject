package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOutPage {

	@FindBy(xpath="//input[@title='Qty']")private WebElement qty;
	@FindBy(xpath="(//button[@name='update_cart_action'])[4]")private WebElement update;
	@FindBy(xpath="(//button[@type='submit'])[3]")private WebElement emptycart;
	
	
	public ProceedToCheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public String changeQuantity(String addquantity) {
		qty.sendKeys(addquantity);
		return addquantity;
	}
	
	public void clickOnUpdate() {
		update.click();
	}
	
	public void clickOnEmptyCart() {
		emptycart.click();
	}
}
