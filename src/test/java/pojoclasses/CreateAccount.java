package pojoclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.*;
import org.utilities.BaseClass1;

public class CreateAccount extends BaseClass1 {
	
	//public static WebDriver driver;
	
	public CreateAccount() {
		
		PageFactory.initElements(driver, this);

	}

	// home page Login Link
	@CacheLookup
//	@FindAll({ @FindBy(className = "site-header__icon site-header__account"),
			@FindBy(xpath = "//a[@class='site-header__icon site-header__account']") 
	//})
	private WebElement homePage_LoginLink;

	// Password
	@CacheLookup
	@FindAll({ @FindBy(id = "customer_register_link"), 
		@FindBy(xpath = "//a[@id='customer_register_link']") })
	private WebElement loginPage_CreateAccountLink;

	// lable=="Create Account"
	@CacheLookup
	@FindBy(xpath = "//h1[normalize-space()='Create Account']")
	private WebElement CreateAccountLable;

	// Fisrt Name
	@CacheLookup
	@FindAll({ @FindBy(id = "RegisterForm-FirstName"), @FindBy(name = "customer[first_name]"),
			@FindBy(xpath = "//input[@id='RegisterForm-FirstName']") })
	private WebElement firstName;

	// Last Name
	@CacheLookup
	@FindAll({ @FindBy(id = "RegisterForm-LastName"), @FindBy(name = "customer[last_name]"),
			@FindBy(xpath = "//input[@id='RegisterForm-LastName']") })
	private WebElement lastName;

	// Email
	@CacheLookup
	@FindAll({ @FindBy(id = "RegisterForm-email"), @FindBy(name = "customer[email]"),
			@FindBy(xpath = "//input[@id='RegisterForm-email']") })
	private WebElement email;

	// Password
	@CacheLookup
	@FindAll({ @FindBy(id = "RegisterForm-password"), @FindBy(name = "customer[password]"),
			@FindBy(xpath = "//input[@id='RegisterForm-password']") })
	private WebElement password;

	// Create button
	@CacheLookup
	@FindBy(xpath = "//input[@value='Create']")
	private WebElement createButton;
//****************************************************************************
	// getter method
	public WebElement getHomePage_LoginLink() {
		return homePage_LoginLink;
	}

	public WebElement getLoginPage_CreateAccountLink() {
		return loginPage_CreateAccountLink;
	}

	public WebElement getCreateAccountLable() {
		return CreateAccountLable;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

}
