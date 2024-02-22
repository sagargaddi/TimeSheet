package Step_Definitions;

import org.openqa.selenium.WebDriver;

import POM_Files.Change_Password;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class ChangePassword_Steps 
{
	public WebDriver driver;
	TestContextSetup testContextSetup;
	Change_Password change_Password;
	
	public ChangePassword_Steps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.change_Password = testContextSetup.pageObjectManager.getChangePasswordPage();
	}
	
	//ChangePassword
	@When("user is on HomePage and clicks on User icon")
	public void user_is_on_home_page_and_clicks_on_user_icon() 
	{
	   change_Password.clickOnUserIcon();
	}
	
	@And("Further clicks on Change Password option")
	public void further_clicks_on_change_password_option() 
	{
	   change_Password.clickOnChangePassword();
	}
	
	@Then("user should get options to enter {string}, {string} and {string}")
	public void user_should_get_options_to_enter_and_akshay(String Current_Password, String New_Password, String Confirm_Password) 
	{
	   change_Password.enterCurrentPassword(Current_Password);
	   change_Password.enterNewPassword(New_Password);
	   change_Password.enterConfirmPassword(Confirm_Password);
	}
	
	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() 
	{
	   change_Password.clickOnSubmitButton();
	}
	
	@Then("user should be able to update password")
	public void user_should_be_able_to_update_password() 
	{
	   change_Password.passwordChangedSuccessfully();
	}

}
