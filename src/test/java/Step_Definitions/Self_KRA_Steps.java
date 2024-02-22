package Step_Definitions;

import org.openqa.selenium.WebDriver;

import POM_Files.Self_KRA;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class Self_KRA_Steps 
{	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	Self_KRA self_KRA;
	
	public Self_KRA_Steps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.self_KRA = testContextSetup.pageObjectManager.getSelfKRAPage();
	}
	
	
	//@Self_KRA
	@Then("user should land on Self KRA Page")
	public void user_should_land_on_self_kra_page() 
	{
	    self_KRA.userIsOnSelfKRAPage();
	}
	
	
	//@Change_Quarter
	@When("user is on Self KRA Page and clicks on Listbox to change Quarter")
	public void user_is_on_self_kra_page_and_clicks_on_listbox_to_change_quarter() 
	{
		self_KRA.clickOnListBox();
	}
	
	@And("sends input {string}")
	public void sends_input(String Quarter) throws InterruptedException
	{
	    self_KRA.Enter_Quarter(Quarter);
	}
	
	@Then("user should be able to see Self KRA details for that Quarter")
	public void user_should_be_able_to_see_self_kra_details_for_that_quarter() 
	{
		self_KRA.verifyDetailsDisplayed();
	}
	
	
	//@Change_Year
	@When("user is on Self KRA Page and clicks on Listbox to change Year")
	public void user_is_on_self_kra_page_and_clicks_on_listbox_to_change_year() 
	{
	   
	}
	@And("sends input <Year>")
	public void sends_input_year() 
	{
	   
	}
	@Then("user should be able to see Self KRA details for that Year")
	public void user_should_be_able_to_see_self_kra_details_for_that_year() 
	{
	   
	}

}
