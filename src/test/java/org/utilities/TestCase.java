package org.utilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pojoclasses.HomePagePojo;

public class TestCase extends BaseClass1 {
public static void main(String[] args) {
	lunchChrome();
	maxWin();
	passURL("https://themeatmarket.ph/");
	HomePagePojo h = new HomePagePojo();
	javaScriptExecutorClickcall(h.getChicken());
	javaScriptExecutorClickcall(h.getChicken_cut_ups_Chicken());
	siwtchIntoWindow();
	WaitImpcitwaitCall(10);
	String title = getTitlecall();
	
	Assert.assertTrue(title.contains("Whole Chicken – The Meat Market Ph"));
}
}
