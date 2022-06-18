package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass1;

public class ForgetPasswordTest extends BaseClass1{

	public ForgetPasswordTest() {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath = "//a[@class='site-header__icon site-header__account']") 
	private WebElement homePageLoginLink;
	
	@FindAll({
		@FindBy(css ="#RecoverPassword"),
		@FindBy(css ="a#RecoverPassword"),
		@FindBy(xpath ="//a[text()='Forgot your password?']")
	})
	private WebElement forgetPasswordLink;
	
	@FindAll({
		@FindBy(css ="#RecoverHeading"),
		@FindBy(xpath ="//h2[text()='Reset your password']")
	})
	private WebElement forgetPasswordlable;
	
	@FindAll({
		@FindBy(css ="input#RecoverEmail[name =email]"),
		@FindBy(css ="input.input-full")
	})
	private WebElement forgetPasswordEmailBox;


	@FindBy(css ="input.input-full")
private WebElement forgetPasswordsign_in_Button ;

	@FindAll({
		@FindBy(css ="#a#HideRecoverPasswordLink"),
		@FindBy(xpath ="//a[text()='Cancel']")
	})
	private WebElement forgetPasswordcancelLink;

	public WebElement getHomePageLoginLink() {
		return homePageLoginLink;
	}

	public WebElement getForgetPasswordLink() {
		return forgetPasswordLink;
	}

	public WebElement getForgetPasswordlable() {
		return forgetPasswordlable;
	}

	public WebElement getForgetPasswordEmailBox() {
		return forgetPasswordEmailBox;
	}

	public WebElement getForgetPasswordsign_in_Button() {
		return forgetPasswordsign_in_Button;
	}

	public WebElement getForgetPasswordcancelLink() {
		return forgetPasswordcancelLink;
	}
	
}
