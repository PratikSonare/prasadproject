package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage {

	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement LGaddtocart;
	@FindBy(xpath="(//a[text()='Add to Wishlist'])[1]")private WebElement LGaddtowishlist;
	
	
	
	public TVPage(WebDriver driver) {
		LGaddtocart.click();
	}
	
	public void LGAddToCart() {
		LGaddtocart.click();
	}
	
	public void LGAddToWishList() {
		LGaddtowishlist.click();
	}
}
