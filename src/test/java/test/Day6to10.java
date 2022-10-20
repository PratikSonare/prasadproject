package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.CheckoutPage;
import pom.MagentohomePage;
import pom.MyDashBoardPage;
import pom.MyWishListPage;
import pom.MyaccountPage;

public class Day6to10 {

	WebDriver driver;
	
	@BeforeTest
	public void openChrome() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void registerUserCanableToPurchase() {
		MagentohomePage homepage=new MagentohomePage(driver);
		homepage.clickOnMyAccount();
		
		MyaccountPage myaccount=new MyaccountPage(driver);
		myaccount.enteremail("pk13066@gmail.com");
		myaccount.enterpassword("123456pk");
		myaccount.clickOnLogIn();
		
		MyDashBoardPage dashboard=new MyDashBoardPage(driver);
		dashboard.clickOnMyWishlist();
		
		MyWishListPage wishlist= new MyWishListPage(driver);
		wishlist.clickOnAddToCart();
		
		CheckoutPage checkout=new CheckoutPage(driver);
		checkout.clickOnCheckout();
		checkout.selectCountry("United States");
		checkout.selectState("New York");
		checkout.enterZip("542896");
		
		
		
		
		
	}
	
	
	
}
