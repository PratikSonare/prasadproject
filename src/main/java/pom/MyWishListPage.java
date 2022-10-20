package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishListPage {
	
	@FindBy(xpath="//button[@title='Share Wishlist']")private WebElement sharewishlist;
	@FindBy(xpath="//textarea[@name='emails']")private WebElement emailsforshare;
	@FindBy(xpath="//textarea[@id='message']")private WebElement message;
	@FindBy(xpath="//button[@title='Add to Cart']")private WebElement cart;
	
	
	
	public  MyWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void shareWishlist() {
		sharewishlist.click();
	}
	
	public String emailstoshare(String enteremails) {
		emailsforshare.sendKeys(enteremails);
		return enteremails;		
	}
	
	public String enterMessage(String entermessage) {
		message.sendKeys(entermessage);
		return entermessage;
	}
	
	public void clickOnAddToCart() {
		cart.click();
	}

}
