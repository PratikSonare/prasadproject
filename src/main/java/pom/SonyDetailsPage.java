package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SonyDetailsPage {

	@FindBy(xpath="//span[text()='$100.00']")private WebElement sonycost;
	@FindBy(xpath="//input[@type='text']")private WebElement qty;
	@FindBy(xpath="//button[@title='Add to Cart']")private WebElement addtocart;
	
	
	
	public SonyDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String getSonyCost() {
		String cost=sonycost.getText();
		return cost;
	}
	
	public void changeQuantity(int addquantity){
		qty.click();
		
	}
	
	public void addtocart() {
		addtocart.click();
	}
}
