package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MobilePage {
	
	@FindBy(xpath="//a[@title='Sony Xperia']")private WebElement sony;
	@FindBy(xpath="(//a[@title='IPhone'])[1]")private WebElement iphone;
	@FindBy(xpath="(//a[@title='Samsung Galaxy'])[1]")private WebElement samsung;
	@FindBy(xpath="(//button[@class='button btn-cart'])[1]")private WebElement sonyaddcart;
	@FindBy(xpath="(//button[@class='button btn-cart'])[2]")private WebElement iphoneaddcart;
	@FindBy(xpath="(//button[@class='button btn-cart'])[3]")private WebElement samsungaddcart;
	@FindBy(xpath="(//a[text()='Add to Wishlist'])[1]")private WebElement sonyaddwish;
	@FindBy(xpath="(//a[text()='Add to Wishlist'])[2]")private WebElement iphoneaddwish;
	@FindBy(xpath="(//a[text()='Add to Wishlist'])[3]")private WebElement samsungaddwish;
	@FindBy(xpath="(//a[text()='Add to Compare'])[2]")private WebElement sonyaddcompare;
	@FindBy(xpath="(//a[text()='Add to Compare'])[3]")private WebElement iphoneaddcompare;
	@FindBy(xpath="(//a[text()='Add to Compare'])[1]")private WebElement samsungaddcompare;
	@FindBy(xpath="(//select[@title='Sort By'])[1]")private WebElement sortby;
	@FindBy(xpath="//span[text()='$100.00']")private WebElement sonycost;
	@FindBy(xpath="//button[@title='Compare']")private WebElement compare;

	
	public MobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSony() {
		sony.click();
	}
	
	public void clickOnIphone() {
		iphone.click();
	}
	
	public void clickOnSamsung() {
		samsung.click();
	}
	
	public void clickOnSonyAddCart() {
		sonyaddcart.click();
	}
	
	public void clickOnIphoneAddCart() {
		iphoneaddcart.click();
	}
	
	public void clickOnSonyAddWish() {
		sonyaddwish.click();
	}
	
	public void clickOnSamsungAddWish() {
		samsungaddwish.click();
	}
	
	public void clickOnIphoneAddWish() {
		iphoneaddwish.click();
	}
	
	public void clickOnSonyAddCompare() {
		sonyaddcompare.click();
	}
	
	public void clickOnIphoneAddCompare() {
		iphoneaddcompare.click();
	}
	
	public void clickOnSamsungAddCompare() {
		samsungaddcompare.click();
	}
	
	public void selectSortBy(String entertext) {
		Select s=new Select(sortby);
		s.selectByVisibleText(entertext);
	}
	
	public String getSonyCost() {
		String SonyCost=sonycost.getText();
		return SonyCost;
	}
	
	public void clickOnCompare() {
		compare.click();
	}
}
