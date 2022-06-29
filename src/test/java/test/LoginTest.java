package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass1;

import io.github.bonigarcia.wdm.WebDriverManager;
import pojoclasses.Login;

public class LoginTest extends BaseClass1 {
	@Parameters({"Crossbrowser"})
	@BeforeMethod
	
	private void lunchBrowser(String browser) {
		//lunchChrome();

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
			
			
			
			

		
		maxWin();
	}

	@AfterClass
	private void closeBrowser() {
		driver.close();

	}

	@BeforeMethod
	private void lunchURL() {
		passURL("https://themeatmarket.ph/");
		siwtchIntoWindow();
		Login log = new Login();
		clickbtn(log.getHomePageLoginLink());
		WebElement lable = log.getLoginLable();
		Assert.assertEquals("Login", lable.getText(), "Test Case Passed");

	}

	@AfterMethod
	private void time() {

		dateprint();
	}
@Test
	private void Valid_userName_And_Valid_Password() {
		Login log = new Login();

		sendKeyCall(log.getUserName(), "ajaynonia666@gmail.com");
		sendKeyCall(log.getPassword(), "Ajaynonia@96");
		clickbtn(log.getLoginButton());

	}
@Test
private void Invalid_userName_And_Valid_Password() {
	Login log = new Login();

	sendKeyCall(log.getUserName(), "Ajua66@gmali.com");
	sendKeyCall(log.getPassword(), "Ajaynonia@96");
	clickbtn(log.getLoginButton());

}
@Test
private void valid_userName_And_InValid_Password() {
	Login log = new Login();

	sendKeyCall(log.getUserName(), "ajaynonia666@gmial.com");
	sendKeyCall(log.getPassword(), "Ajay2222a@96");
	clickbtn(log.getLoginButton());

}
@Test
private void Invalid_userName_And_InValid_Password() {
	Login log = new Login();

	sendKeyCall(log.getUserName(), "Ajua66@gmali.com");
	sendKeyCall(log.getPassword(), "Aj233ds3399074nia@96");
	clickbtn(log.getLoginButton());

}

}
