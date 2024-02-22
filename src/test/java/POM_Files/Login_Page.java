package POM_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
public WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By username = By.xpath("//input[@placeholder='Email']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By signIn = By.xpath("//button[@type='submit']");
	
	//@Login
	public String getTitleofLoginPage()
	{
		return driver.getTitle();
	}
	
	public void enterUsername(String Username)
	{
		driver.findElement(username).sendKeys(Username);
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(signIn).click();
	}

	//Logout
	public void verifyUserisNavigatedtoLoginPage()
	{
		driver.findElement(signIn).isDisplayed();
	}
}
