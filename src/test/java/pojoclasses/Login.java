package pojoclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass1;

public class Login  extends BaseClass1{
//WebDriver driver ;
	public Login() {
		PageFactory.initElements(driver, this);
	}

	// home page Login Link
	@CacheLookup
	//@FindAll({ @FindBy(className = "site-header__icon site-header__account"),
			@FindBy(xpath = "//a[@class='site-header__icon site-header__account']") 
	//})
	private WebElement homePageLoginLink;

	// lable=="LOGIN"
	@CacheLookup
	@FindAll({ @FindBy(id = "LoginHeading"), @FindBy(xpath = "//h1[text()='Login']") })
	private WebElement loginLable;
	
	// UserName
	@CacheLookup
	@FindAll({ @FindBy(id = "CustomerEmail"), @FindBy(name = "customer[email]"),
			@FindBy(xpath = "//input[@id='CustomerEmail']") })
	private WebElement userName;

	// Password
	@CacheLookup
	@FindAll({ @FindBy(id = "CustomerPassword"), @FindBy(name = "customer[password]"),
			@FindBy(xpath = "//input[@id='CustomerPassword']") })
	private WebElement password;

// LoginButton
	@CacheLookup
	@FindBy(xpath = "//input[@value='Sign In']")

	private WebElement loginButton;

	public WebElement getHomePageLoginLink() {
		return homePageLoginLink;
	}

	public WebElement getLoginLable() {
		return loginLable;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
