package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Files.Login_Page;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class Login_Steps 
{
	public WebDriver driver;
	TestContextSetup testContextSetup;
	Login_Page loginPage;

	//@Login
	public Login_Steps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	  Assert.assertTrue(loginPage.getTitleofLoginPage().contains("Login - Growexx"));
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String Username, String Password) 
	{
	    loginPage.enterUsername(Username);
	    loginPage.enterPassword(Password);
	}
	
	@When("clicks on Sign In button")
	public void clicks_on_sign_in_button() 
	{
	  	loginPage.clickOnSignIn();
	}
	
	//@Logout
	@Then("user should be logged out and navigated back to login page")
	public void user_should_be_logged_out_and_navigated_back_to_login_page() 
	{
	    loginPage.verifyUserisNavigatedtoLoginPage();
	}

}
