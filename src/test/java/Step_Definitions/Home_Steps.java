package Step_Definitions;

import org.openqa.selenium.WebDriver;

import POM_Files.Home_Page;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class Home_Steps 
{
	public WebDriver driver;
	TestContextSetup testContextSetup;
	Home_Page homePage;
	
	public Home_Steps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.homePage = testContextSetup.pageObjectManager.getHomePage();
	}
	
	//@Login
	@Then("user is navigated to TimeSheet HomePage")
	public void user_is_navigated_to_time_sheet_home_page() 
	{
		homePage.verifyHomePage();
	}
	
	
	//@SyncLogs
	@When("user clicks on Sync Logs")
	public void user_clicks_on_sync_logs() 
	{
	    homePage.clickOnSyncLogs();
	}
	@And("Enters From and To dates")
	public void enters_from_and_to_dates() 
	{
		homePage.clickOnFrom();
		homePage.selectFromDate();
		homePage.selectToDate();   
	}
	@And("clicks on Sync button")
	public void clicks_on_sync_button() 
	{
	    homePage.clickOnSync();
	}
	@Then("logs should be synced and verify download button is clickable")
	public void logs_should_be_synced_and_verify_download_button_is_clickable()
	{
	    homePage.verifySuccess();
	}
	
	
	//@Logout
	@And("Further clicks on Logout option")
	public void further_clicks_on_logout_option() 
	{
	    homePage.clickOnLogout();
	}
	
	
	//@Self_KRA
	@When("user is on HomePage and clicks on Key icon")
	public void user_is_on_home_page_and_clicks_on_key_icon()
	{
	   homePage.clickOnKey();
	}
	
	@And("Further clicks on Assignment and Self KRA")
	public void further_clicks_on_assignment_and_self_kra()
	{
	   homePage.clickOnAssignment();
	   homePage.clickOnKRA();
	}	

}