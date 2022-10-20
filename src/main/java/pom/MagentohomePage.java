package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentohomePage {
	
	@FindBy(xpath="//a[text()='Mobile']") private WebElement mobile;
	@FindBy(xpath="//a[text()='TV']")private WebElement tv;
	@FindBy(xpath="(//a[@title='My Account'])[2]") private WebElement myaccount;
	@FindBy(xpath="//a[@title='Orders and Returns']") private WebElement ordersandreturns;
	@FindBy(xpath="(//span[text()='Account'])[1]")private WebElement account;
	@FindBy(xpath="//span[text()='Cart']")private WebElement cart;
	@FindBy(xpath="//input[@id='search']")private WebElement search;
	@FindBy(xpath="(//button [@type='submit'])[1]")private WebElement searchbutton;
	@FindBy(xpath="//a[@title='Advanced Search']")private WebElement advancedsearch;
	@FindBy(xpath="//h2")private WebElement heading;
	
	public MagentohomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMobile() {
		mobile.click();
	}

	public void clickOntv() {
		tv.click();
	}
	
	public void clickOnMyAccount() {
		myaccount.click();
	}
	
	public void clickOnOrdersAndReturns() {
		ordersandreturns.click();
	}

	public void clickOnAccount() {
		account.click();
	}
	
	public void clickOnCart() {
		cart.click();
	}
	
	public void sendOnSearch(String EnterSearch) {
		search.sendKeys(EnterSearch);
		searchbutton.click();
	}
	
	public void advancedSearch() {
		advancedsearch.click();
	}
}
