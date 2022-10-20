package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDashBoardPage {

	@FindBy(xpath="//h1[text()='My Dashboard']")private WebElement heading;
	@FindBy(xpath="//a[text()='TV']")private WebElement tv;
	@FindBy(xpath="//a[text()='My Wishlist']")private WebElement wishlist;
	
	
	public MyDashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getHeading() {
		String head=heading.getText();
		return head;
	}
	
	public void clickonTV() {
		tv.click();
	}
	
	public void clickOnMyWishlist() {
		wishlist.click();
	}
	
}
