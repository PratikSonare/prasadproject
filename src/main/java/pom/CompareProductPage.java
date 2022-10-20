package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProductPage {

	@FindBy(xpath="//h1[text()='Compare Products']")private WebElement head;
	
	
	
	
	public CompareProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String heading() {
		String heading=head.getText();
		return heading;
	}
}
