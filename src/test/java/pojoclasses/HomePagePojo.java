package pojoclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass1;

public class HomePagePojo extends BaseClass1 {

	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(className = "site-header__icon site-header__cart"),
			
	@FindBy(xpath = "//a[@class='site-header__icon site-header__cart']"),
	@FindBy(xpath="//a[contains(@class,'site-header__cart')]")
	})
	
	private WebElement Add_To_Cart;

	//@FindAll({ @FindBy(className = "site-header__icon site-header__cart"),
			@FindBy(xpath = "//a[@class='site-header__icon site-header__account']")
			//})
	public WebElement Login_Account;

	@FindAll({ @FindBy(className = "btn--link site-header__icon site-header__search-toggle js-drawer-open-top"),
			@FindBy(xpath = "//button[@type='button'][@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']") })
	public WebElement search_Box;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[5]"),
			@FindBy(xpath = "(//span[text()='FAQs'])[1]") })
	public WebElement FAQ;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[4]"),
			@FindBy(xpath = "(//span[text()='Ready to Cook'])[1]") })
	public WebElement Ready_to_Cook;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[7]"),
			@FindBy(xpath = "(//span[text()='Easy Recipes'])[1]") })
	public WebElement Easy_Recipes;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[6]"),
			@FindBy(xpath = "(//span[text()='Become a Reseller'])[1]") })
	public WebElement Become_a_Reseller;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[3]"),
			@FindBy(xpath = "(//span[text()='Produce'])[1]") })
	public WebElement Produce;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[2]"),
			@FindBy(xpath = "(//span[text()='Beef'])[1]") })
	public WebElement Beef;

	@FindAll({ @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--main'])[1]"),
			@FindBy(xpath = "(//span[text()='All Products'])[1]") })
	public WebElement All_Products;

	@FindAll({ @FindBy(xpath = "(//button[@class='site-nav__link site-nav__link--main site-nav__link--button'])[1]"),
			@FindBy(xpath = "(//span[text()='Chicken'])[1]") })
	public WebElement chicken;

	@FindAll({ @FindBy(xpath = "(//button[@class='site-nav__link site-nav__link--main site-nav__link--button'])[2]"),
			@FindBy(xpath = "(//span[text()='Pork'])[1]") })
	public WebElement Pork;

	@FindAll({ @FindBy(className = "site-header__logo-image"), @FindBy(xpath = "//a[@class='site-header__logo-image']"),
			@FindBy(xpath = "(//img)[1]") })
	public WebElement The_Meat_Market;

	@FindAll({ @FindBy(xpath = "//img[@id='FeatureRowImage-1632019108afadd66a']"), @FindBy(xpath = "(//img)[1]") })
	public WebElement Bounty_Fresh_Reseller;
//**********************************************************************************************
	@FindBy(xpath = "//h2[text()='Featured Products']")
	public WebElement Featured_Products;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Breast']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[1]") })
	public WebElement Product_Chicken_Breast;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Breast Fillet (Skinless)']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[2]") })
	public WebElement Product_Chicken_Breast_Fillet_Skinless;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Drumstick']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[3]") })
	public WebElement Product_Chicken_Drumstick;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Leg Quarter']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[4]") })
	public WebElement Product_Chicken_Leg_Quarter;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Thigh']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[5]") })
	public WebElement Product_Chicken_Thigh;

	@FindAll({ @FindBy(xpath = "//span[text()='Chicken Thigh Fillet (Skinless)']"),
			@FindBy(xpath = "(//a[@class='grid-view-item__link grid-view-item__image-container full-width-link'])[6]") })
	public WebElement Product_Chicken_Thigh_Fillet_Skinless;
//****************************************************************************************	
	@FindBy(xpath = "//h2[text()='SHOP BY CATEGORY']")
	public WebElement SHOP_BY_CATEGORY;

	@FindAll({ @FindBy(xpath = "//a[text()='SHOP PORK']"),
			@FindBy(xpath = "(//a[@class='btn btn--secondary btn--small'])[1]") })
	public WebElement SHOP_BY_CATEGORY_SHOP_PORK;

	@FindAll({ @FindBy(xpath = "//a[text()='SHOP CHICKEN']"),
			@FindBy(xpath = "(//a[@class='btn btn--secondary btn--small'])[2]") })
	public WebElement SHOP_BY_CATEGORY_SHOP_CHICKEN;

	@FindAll({ @FindBy(xpath = "//a[text()='SHOP READY TO COOK']"),
			@FindBy(xpath = "(//a[@class='btn btn--secondary btn--small'])[3]") })
	public WebElement SHOP_BY_CATEGORY_SHOP_READY_TO_COOK;
	// ***************************************************************************
	@FindBy(xpath = "//h2[text()='Bounty Fresh Honey']")
	public WebElement Bounty_Fresh_Honey;

	@FindAll({ @FindBy(xpath = "//a[text()='BUY NOW']"), @FindBy(xpath = "//a[@aria-label='BUY NOW: Honey Honig']") })
	public WebElement Bounty_Fresh_Honey_BUY_NOW;
	// *************************************************************************

	@FindBy(xpath = "//h2[text()='Quick links']")
	public WebElement Quick_links;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'All Products')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[1]") })
	public WebElement Quick_links_All_Products;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Chicken')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[2]") })
	public WebElement Quick_links_Chicken;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Pork')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[3]") })
	public WebElement Quick_links_Pork;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Beef')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[4]") })
	public WebElement Quick_links_Beef;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Produce')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[5]") })
	public WebElement Quick_links_Produce;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Ready to Cook')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[6]") })
	public WebElement Quick_links_Ready_to_Cook;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Easy Recipes')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[7]") })
	public WebElement Quick_links_Easy_Recipes;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'FAQs')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[8]") })
	public WebElement Quick_links_FAQs;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Become a Reseller')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[9]") })
	public WebElement Quick_links_Become_a_Reseller;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]"),
			@FindBy(xpath = "(//li[@class='site-footer__linklist-item'])[10]") })
	public WebElement Quick_links_Privacy_Policy;

	@FindBy(xpath = "(//a[contains(text(),'The Meat Market Ph')])[1]")
	public WebElement bottom_Link_The_Meat_Market_Ph;
	
	@FindBy(xpath = "(//a[contains(text(),'Powered by Shopify')])[1]")
	public WebElement bottom_Link_Powered_by_Shopify;

	public WebElement getAdd_To_Cart() {
		return Add_To_Cart;
	}

	public WebElement getLogin_Account() {
		return Login_Account;
	}

	public WebElement getSearch_Box() {
		return search_Box;
	}

	public WebElement getFAQ() {
		return FAQ;
	}

	public WebElement getReady_to_Cook() {
		return Ready_to_Cook;
	}

	public WebElement getEasy_Recipes() {
		return Easy_Recipes;
	}

	public WebElement getBecome_a_Reseller() {
		return Become_a_Reseller;
	}

	public WebElement getProduce() {
		return Produce;
	}

	public WebElement getBeef() {
		return Beef;
	}

	public WebElement getAll_Products() {
		return All_Products;
	}

	public WebElement getChicken() {
		return chicken;
	}

	public WebElement getPork() {
		return Pork;
	}

	public WebElement getThe_Meat_Market() {
		return The_Meat_Market;
	}

	public WebElement getBounty_Fresh_Reseller() {
		return Bounty_Fresh_Reseller;
	}

	public WebElement getFeatured_Products() {
		return Featured_Products;
	}

	public WebElement getProduct_Chicken_Breast() {
		return Product_Chicken_Breast;
	}

	public WebElement getProduct_Chicken_Breast_Fillet_Skinless() {
		return Product_Chicken_Breast_Fillet_Skinless;
	}

	public WebElement getProduct_Chicken_Drumstick() {
		return Product_Chicken_Drumstick;
	}

	public WebElement getProduct_Chicken_Leg_Quarter() {
		return Product_Chicken_Leg_Quarter;
	}

	public WebElement getProduct_Chicken_Thigh() {
		return Product_Chicken_Thigh;
	}

	public WebElement getProduct_Chicken_Thigh_Fillet_Skinless() {
		return Product_Chicken_Thigh_Fillet_Skinless;
	}

	public WebElement getSHOP_BY_CATEGORY() {
		return SHOP_BY_CATEGORY;
	}

	public WebElement getSHOP_BY_CATEGORY_SHOP_PORK() {
		return SHOP_BY_CATEGORY_SHOP_PORK;
	}

	public WebElement getSHOP_BY_CATEGORY_SHOP_CHICKEN() {
		return SHOP_BY_CATEGORY_SHOP_CHICKEN;
	}

	public WebElement getSHOP_BY_CATEGORY_SHOP_READY_TO_COOK() {
		return SHOP_BY_CATEGORY_SHOP_READY_TO_COOK;
	}

	public WebElement getBounty_Fresh_Honey() {
		return Bounty_Fresh_Honey;
	}

	public WebElement getBounty_Fresh_Honey_BUY_NOW() {
		return Bounty_Fresh_Honey_BUY_NOW;
	}

	public WebElement getQuick_links() {
		return Quick_links;
	}

	public WebElement getQuick_links_All_Products() {
		return Quick_links_All_Products;
	}

	public WebElement getQuick_links_Chicken() {
		return Quick_links_Chicken;
	}

	public WebElement getQuick_links_Pork() {
		return Quick_links_Pork;
	}

	public WebElement getQuick_links_Beef() {
		return Quick_links_Beef;
	}

	public WebElement getQuick_links_Produce() {
		return Quick_links_Produce;
	}

	public WebElement getQuick_links_Ready_to_Cook() {
		return Quick_links_Ready_to_Cook;
	}

	public WebElement getQuick_links_Easy_Recipes() {
		return Quick_links_Easy_Recipes;
	}

	public WebElement getQuick_links_FAQs() {
		return Quick_links_FAQs;
	}

	public WebElement getQuick_links_Become_a_Reseller() {
		return Quick_links_Become_a_Reseller;
	}

	public WebElement getQuick_links_Privacy_Policy() {
		return Quick_links_Privacy_Policy;
	}

	public WebElement getBottom_Link_The_Meat_Market_Ph() {
		return bottom_Link_The_Meat_Market_Ph;
	}

	public WebElement getBottom_Link_Powered_by_Shopify() {
		return bottom_Link_Powered_by_Shopify;
	}

	

}
