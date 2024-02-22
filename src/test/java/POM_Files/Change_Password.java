package POM_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Change_Password 
{
public WebDriver driver;
	
	public Change_Password(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//@ChangePassword
	private By user_icon = By.xpath("//span[@class='anticon anticon-user']");
	private By change_password = By.xpath("//a[normalize-space()='Change Password']");
	private By current_password = By.xpath("//input[@placeholder='Current Password']");
	private By new_password = By.xpath("//input[@placeholder='New Password']");
	private By confirm_password = By.xpath("//input[@placeholder='Confirm Password']");
	private By submit = By.xpath("//button[@type='submit']");
	
	
	//@ChangePassword
	public void clickOnUserIcon()
	{
		driver.findElement(user_icon).click();
	}
	
	public void clickOnChangePassword()
	{
		driver.findElement(change_password).click();
	}
		
	public void enterCurrentPassword(String Current_Password)
	{
		driver.findElement(current_password).sendKeys(Current_Password);
	}
	
	public void enterNewPassword(String New_Password)
	{
		driver.findElement(new_password).sendKeys(New_Password);
	}
		
	public void enterConfirmPassword(String Confirm_Password)
	{
		driver.findElement(confirm_password).sendKeys(Confirm_Password);
	}
		
	public void clickOnSubmitButton()
	{
		driver.findElement(submit).click();
	}
	
	public void passwordChangedSuccessfully()
	{
		System.out.println("Password Changed Successfully"); //no code written as unable to catch the alert
	}

}
