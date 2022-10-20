package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	@FindBy(xpath="//input[@id='firstname']")private WebElement name;
	@FindBy(xpath="//input[@id='middlename']")private WebElement middlename;
	@FindBy(xpath="//input[@id='lastname']")private WebElement lastname;
	@FindBy(xpath="(//input[@type='email'])[1]")private WebElement email;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//input[@title='Confirm Password']")private WebElement confirmpassword;
	@FindBy(xpath="//button[@title='Register']")private WebElement register;
	
	
	
	public CreateAccountPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String enterName(String entername) {
		name.sendKeys(entername);
		return entername;
	}
	
	public String enterMiddlename(String entermiddlename) {
		middlename.sendKeys(entermiddlename);
		return entermiddlename;
	}
	
	public String enterLastName(String enterlastname) {
		lastname.sendKeys(enterlastname);
		return enterlastname;
	}
	
	public String EnterEmail(String enteremail) {
		email.sendKeys(enteremail);
		return enteremail;
	}
	
	public String enterPassword(String enterpassword) {
		password.sendKeys(enterpassword);
		return enterpassword;
	}
	
	public String ConfirmPassword(String enterpasswordagain) {
		confirmpassword.sendKeys(enterpasswordagain);
		return enterpasswordagain;
	}
	
	public void clickOnRegister() {
		register.click();
	}

	
	
	
	
	
	
}
