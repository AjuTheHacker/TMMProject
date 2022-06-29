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
		siwtchIntoWindow();
	}

	@AfterMethod
	private void time() {

		dateprint();
	}

	@Test
	public void Validate_navigating_from_Home_Page_from_All_Products_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getAll_Products());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("All Products – The Meat Market Ph"));
	}
	//******************************************************************************
	@Test
	public void Validate_navigating_from_Home_Page_from_Whole_Chicken_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getChicken());
		javaScriptExecutorClickcall(h.getChicken_Whole_Chicken());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Whole Chicken – The Meat Market Ph"));
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_cut_ups_Chicken_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getChicken());
		javaScriptExecutorClickcall(h.getChicken_cut_ups_Chicken());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Cut-ups – The Meat Market Ph"));
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Breaded_Chicken_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getChicken());
		javaScriptExecutorClickcall(h.getChicken_Breaded_Chicken());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Breaded Chicken – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Marinated_Chicken_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getChicken());
		javaScriptExecutorClickcall(h.getChicken_Marinated_Chicken());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Marinated Chicken – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_prok_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getPork());
		javaScriptExecutorClickcall(h.getPork_prok());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Pork – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Marinated_Pork_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getPork());
		javaScriptExecutorClickcall(h.getPork_Marinated_Pork());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Marinated Pork – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Beef() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getBeef());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Beef – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Produce() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getProduce());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Produce – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Ready_to_Cook() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getReady_to_Cook());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Ready to Cook – The Meat Market Ph"));
		
	}
	
	@Test
	public void Validate_navigating_from_Home_Page_from_FREQUENTLY_ASKED_QUESTIONS_Page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getFAQ());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("FREQUENTLY ASKED QUESTIONS – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_BECOME_A_RESELLER_UPDATED_Page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getBecome_a_Reseller());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("BECOME A RESELLER UPDATED – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Easy_Recipes_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getEasy_Recipes());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Easy Recipes – The Meat Market Ph"));
		
	}
	@Test
	public void Verify_in_Home_Page_lable_BECOME_A_RESELLER() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getBecome_a_Reseller();
		String text = get.getText();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		//Assert.assertTrue(text.contains("RESELLER"));
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Image_Bounty_Fresh_Reseller() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getBounty_Fresh_Reseller();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_lable_Featured_Products() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getFeatured_Products();
		String text = get.getText();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		//Assert.assertTrue(text.contains("Featured"));
		Assert.assertTrue(displayed);
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Breast_Fillet_Skinless() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Breast_Fillet_Skinless();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Drumstick() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Drumstick();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Leg_Quarter() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Leg_Quarter();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Thigh() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Thigh();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Thigh_Fillet_Skinless() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Thigh_Fillet_Skinless();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_Product_is_Display_Chicken_Breast() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getProduct_Chicken_Breast();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(displayed);
		
	}
	@Test
	public void Verify_in_Home_Page_lable_SHOP_BY_CATEGORY() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getSHOP_BY_CATEGORY();
		String text = get.getText();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(text.contains("SHOP BY CATEGORY"));
		Assert.assertTrue(displayed);
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_SHOP_BY_CATEGORY_SHOP_PORK_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getSHOP_BY_CATEGORY_SHOP_PORK());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Pork – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_SHOP_BY_CATEGORY_SHOP_CHICKEN_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getSHOP_BY_CATEGORY_SHOP_CHICKEN());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Chicken – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_READY_TO_COOK_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getSHOP_BY_CATEGORY_SHOP_READY_TO_COOK());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Ready to Cook – The Meat Market Ph"));
		
	}
	@Test
	public void Verify_in_Home_Page_lable_Bounty_Fresh_Honey() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getBounty_Fresh_Honey();
		String text = get.getText();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(text.contains("Bounty Fresh Honey"));
		Assert.assertTrue(displayed);
	}
	// Broken Link
	@Test
	public void Validate_navigating_from_Home_Page_from_Bounty_Fresh_Honey_BUY_NOW_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getBounty_Fresh_Honey_BUY_NOW());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("404 Not Found – The Meat Market Ph"));
		
	}
	@Test
	public void Verify_in_Home_Page_lable_Quick_links() throws InterruptedException {
		WaitImpcitwaitCall(5);
		HomePagePojo h = new HomePagePojo();
		WebElement get = h.getQuick_links();
		String text = get.getText();
		boolean displayed = get.isDisplayed();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(text.contains("Quick"));
		Assert.assertTrue(displayed);
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_All_Products_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_All_Products());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("All Products – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Chicken_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Chicken());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Chicken – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Prok_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Pork());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Pork – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Beef_Page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Beef());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Beef – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Produce_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Produce());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Produce – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Ready_to_Cook_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Ready_to_Cook());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Ready to Cook – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Easy_Recipes_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Easy_Recipes());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("Easy Recipes – The Meat Market Ph"));
		
	}
	
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_FREQUENTLY_ASKED_QUESTIONS_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_FAQs());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("FREQUENTLY ASKED QUESTIONS – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_BECOME_A_RESELLER_UPDATED_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Easy_Recipes());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
	//	Assert.assertTrue(title.contains("BECOME A RESELLER UPDATED – The Meat Market Ph"));
		
	}
	@Test
	public void Validate_navigating_from_Home_Page_from_Quick_links_Privacy_Policy_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getQuick_links_Privacy_Policy());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		Assert.assertTrue(title.contains("PRIVACY POLICY – The Meat Market Ph"));
		
	}
	@Test(priority = 35)
	public void Validate_navigating_from_Home_Page_from_Create_your_online_store_today_with_Shopify_page() throws InterruptedException {
		
		HomePagePojo h = new HomePagePojo();
		javaScriptExecutorClickcall(h.getBottom_Link_Powered_by_Shopify());
		String title = getTitlecall();
		WaitImpcitwaitCall(10);
		//Assert.assertTrue(title.contains("Shopify"));
		
	}
	
	
	
	
	
	
}
