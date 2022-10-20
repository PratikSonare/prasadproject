package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","I:\\Testing\\velocity\\automation\\selenium\\chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://live.techpanda.org/index.php/");
		
		driver.manage().window().maximize();
		
		return driver;
	}
}
