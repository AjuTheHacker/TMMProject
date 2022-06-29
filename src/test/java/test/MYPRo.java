package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MYPRo {
	WebDriver driver;
	@Parameters({"browser"})
@Test

		public void Browsertest(String browser) {
			
			if(browser.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browser.contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
				
			}
			else if (browser.contains("edge")) {
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
				
			}
		
			
		
	}
	@Test
	public void tc11() {
		System.out.println("test");
		//Assert.assertTrue(false);
		
	}
	@Test
	public void tc12() {
		System.out.println("test");
		Assert.assertTrue(true);
		
	}
	
}
