package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.CompareProductPage;
import pom.CreateAccountPage;
import pom.MagentohomePage;
import pom.MobilePage;
import pom.MyDashBoardPage;
import pom.MyWishListPage;
import pom.MyaccountPage;

import pom.ProceedToCheckOutPage;
import pom.SonyDetailsPage;
import pom.TVPage;
import utility.ExtentReport;


public class Day1to5 {
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
		reports=ExtentReport.getReports();
	}
	
	@BeforeMethod
	public void openChrome() {
		driver=Browser.openBrowser();
		
	}
	
	@Test
	public void verifyMobileList() {
		
		test=reports.createTest("verifyMobileList");
		
		MagentohomePage homepage=new MagentohomePage(driver);
		
		String homepagetitle=driver.getTitle();
		String actualtitle="Home page";
		Assert.assertEquals(actualtitle, homepagetitle);
		
		
		homepage.clickOnMobile();
		MobilePage mobilepage=new MobilePage(driver);
		
		String mobiletitle=driver.getTitle();
		String actualtitle2="Mobile";
		Assert.assertEquals(actualtitle2, mobiletitle);
				
		mobilepage.selectSortBy("Name");		
		
	}
	
	@Test
	public void verifyCost() {
		test=reports.createTest("verifyCost");
		MagentohomePage homepage=new MagentohomePage(driver);
		homepage.clickOnMobile();
		
		MobilePage mobilepage=new MobilePage(driver);
		
		String listcost=mobilepage.getSonyCost();
		mobilepage.clickOnSony();
		
		SonyDetailsPage sonydetailspage=new SonyDetailsPage(driver);
		String detailcost=sonydetailspage.getSonyCost();
		
		Assert.assertEquals(listcost, detailcost);
		
	}
	
	
	@Test
	public void cannotAddMoreThanAvailable() {
		test=reports.createTest("cannotAddMoreThanAvailable");
		MagentohomePage homepage=new MagentohomePage(driver);
		homepage.clickOnMobile();
		
		MobilePage mobilepage=new MobilePage(driver);
		mobilepage.clickOnSonyAddCart();
		
		ProceedToCheckOutPage checkout=new ProceedToCheckOutPage(driver);
		checkout.changeQuantity("1000");
		checkout.clickOnUpdate();
		
		checkout.clickOnEmptyCart();
		
	}
	
	@Test
	public void compareTwoProducts() {
		test=reports.createTest("compareTwoProducts");
		
		MagentohomePage magentohomepage=new MagentohomePage(driver);
		magentohomepage.clickOnMobile();
		
		MobilePage mobilepage=new MobilePage(driver);
		mobilepage.clickOnSonyAddCompare();
		mobilepage.clickOnIphoneAddCompare();
		mobilepage.clickOnCompare();
		
		String handle=driver.getWindowHandle();
		driver.switchTo().window(handle);
		
		CompareProductPage compareproduct=new CompareProductPage(driver);
		String head=compareproduct.heading();
		String actualheading="COMPARE PRODUCTS";
		
		Assert.assertEquals(head, actualheading);
		
		
	}
	
	
	@Test
	public void verifyCreateAccount() {
		test=reports.createTest("verifyCreateAccount");
		MagentohomePage magentohomepage=new MagentohomePage(driver);
		magentohomepage.clickOnMyAccount();
		
		MyaccountPage myaccount=new MyaccountPage(driver);
		myaccount.clickonCreateAccount();
		
		CreateAccountPage createaccount=new CreateAccountPage(driver);
		createaccount.enterName("sayyed");
		createaccount.enterMiddlename("saif");
		createaccount.enterLastName("afzal");
		createaccount.EnterEmail("pk13066@gmail.com");
		createaccount.enterPassword("123456pk");
		createaccount.ConfirmPassword("123456pk");
		createaccount.clickOnRegister();
		
		MyDashBoardPage mydash=new MyDashBoardPage(driver);
		String head1=mydash.getHeading();
		String head2="MY DASHBOARD";
		Assert.assertEquals(head2, head1);
		
		mydash.clickonTV();
		
		TVPage tvpage=new TVPage(driver);
		tvpage.LGAddToWishList();
		
		MyWishListPage wishlist=new MyWishListPage(driver);
		wishlist.shareWishlist();
		
		wishlist.emailstoshare("support@guru99.com");
		wishlist.enterMessage("hey i'm sharing for you");
		
		
	}

	@AfterMethod
	public void captureResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
			
	}

	@AfterTest
	public void flushResults() {
		reports.flush();
	}

}
