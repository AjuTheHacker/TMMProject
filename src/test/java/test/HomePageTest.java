package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass1;

import pojoclasses.HomePagePojo;
import pojoclasses.Login;

public class HomePageTest extends BaseClass1 {

	@BeforeClass
	private void lunchBrowser() {
		lunchChrome();
		maxWin();
	}

	@AfterClass
	private void closeBrowser() {
		// driver.close();

	}

	@BeforeMethod
	private void lunchURL() {
		passURL("https://themeatmarket.ph/");

	}

	@AfterMethod
	private void time() {

		dateprint();
	}

	@Test
	public void Validate_navigating_from_Home_Page_from_Add_to_Cart_page() throws InterruptedException {
		siwtchIntoWindow();
		HomePagePojo h = new HomePagePojo();
		Thread.sleep(2000);
		clickbtn(h.getAdd_To_Cart());
		// clickActionTargetCall(h.getSearch_Box());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertEquals("Your Shopping Cart– The Meat Market Ph", title.contains("Shopping Cart"));
	}

}
