package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPage {

	@FindBy(xpath="(//input[@type='email'])[1]")private WebElement email;
	@FindBy(xpath="//a[@title='Create an Account']")private WebElement createaccount;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement login;
	
	
	
	
	public MyaccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String enteremail(String insertemail) {
		email.sendKeys(insertemail);
		return insertemail;
	}
	
	public void clickonCreateAccount() {
		createaccount.click();
	}
	
	public String enterpassword(String pass) {
		password.sendKeys(pass);
		return pass;
	}
	
	public void clickOnLogIn() {
		login.click();
	}
	
}
