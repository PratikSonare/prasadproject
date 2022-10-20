package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	@FindBy(xpath="(//button[@title='Proceed to Checkout'])[1]")private WebElement checkout;
	@FindBy(xpath="//select[@name='country_id']")private WebElement country;
	@FindBy(xpath="//select[@id='region_id']")private WebElement state;
	@FindBy(xpath="//input[@id='postcode']")private WebElement zip;
	@FindBy(xpath="//button[@title='Estimate']")private WebElement estimate;

	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCheckout() {
		checkout.click();
	}
	
	public void selectCountry(String ctry) {
		Select s=new Select(country);
		s.selectByVisibleText(ctry);
	}
	
	public void selectState(String sta) {
		Select st=new Select(state);
		st.selectByVisibleText(sta);
	}
	
	public String enterZip(String zp) {
		zip.sendKeys(zp);
		return zp;
	}
	
	public void clickOnEstimate() {
		estimate.click();
	}
}
	
	
	
	
