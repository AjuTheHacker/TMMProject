package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass1;

import pojoclasses.CreateAccount;
import pojoclasses.Login;

public class CreateTest extends BaseClass1{
	@BeforeClass
	private void lunchBrowser() {
		lunchChrome();
		maxWin();
	}

	@AfterClass
	private void closeBrowser() {
		//driver.close();

	}

	@BeforeMethod
	private void lunchURL() {
		passURL("https://themeatmarket.ph/");
		siwtchIntoWindow();
		//Login l = new Login();
		
		
		//clickbtn(l.getHomePageLoginLink());
		CreateAccount c = new CreateAccount();
		clickbtn(c.getHomePage_LoginLink());
		siwtchIntoWindow();
		clickbtn(c.getLoginPage_CreateAccountLink());
		WebElement lable = c.getCreateAccountLable();
		Assert.assertEquals("Create Account", lable.getText(), "Test Case Passed");

	}

	@AfterMethod
	private void time() {

		dateprint();
	}
	@Test
	private void valid_FName_Valid_LName_Valid_Email_Valid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "Ajay");	
	sendKeyCall(c.getLastName(), "Kumar");
	sendKeyCall(c.getEmail(), "ajaynonia666@gmai.com");
	sendKeyCall(c.getPassword(), "Ajaynonia@123");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("All_Vaild");
	}
	@Test
	private void Invalid_FName_Valid_LName_Valid_Email_Valid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "12345");	
	sendKeyCall(c.getLastName(), "Kumar");
	sendKeyCall(c.getEmail(), "ajaynonia666@gmai.com");
	sendKeyCall(c.getPassword(), "Ajaynonia@123");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("First_Name_invalid");
	}
	@Test
	private void valid_FName_InValid_LName_Valid_Email_Valid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "Ajay");	
	sendKeyCall(c.getLastName(), "@@##@");
	sendKeyCall(c.getEmail(), "ajaynonia666@gmai.com");
	sendKeyCall(c.getPassword(), "Ajaynonia@123");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("last_Name_invalid");
	}
	@Test
	private void valid_FName_Valid_LName_InValid_Email_Valid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "Ajay");	
	sendKeyCall(c.getLastName(), "Kumar");
	sendKeyCall(c.getEmail(), "11111666@gmai.com");
	sendKeyCall(c.getPassword(), "Ajaynonia@123");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("Email_invalid");
	}
	@Test
	private void valid_FName_Valid_LName_Valid_Email_InValid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "Ajay");	
	sendKeyCall(c.getLastName(), "Kumar");
	sendKeyCall(c.getEmail(), "ajaynonia666@gmai.com");
	sendKeyCall(c.getPassword(), "2#####@123");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("password_invalid");
}
	@Test
	private void invalid_FName_INValid_LName_InValid_Email_INValid_Password() throws IOException {
		CreateAccount c = new CreateAccount();
	sendKeyCall(c.getFirstName(), "##$$#");	
	sendKeyCall(c.getLastName(), "###");
	sendKeyCall(c.getEmail(), "2224@#####");
	sendKeyCall(c.getPassword(), "@52525252");
	clickbtn(c.getCreateButton());
	WaitImpcitwaitCall(15);
	takeScreenshotFullCall("All_invalid");
}
}
