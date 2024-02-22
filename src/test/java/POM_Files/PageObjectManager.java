package POM_Files;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public Login_Page loginPage;
	public Home_Page homePage;
	public Change_Password change_Password;
	public Self_KRA self_KRA;
		
		public PageObjectManager(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public Login_Page getLoginPage()
		{
			loginPage = new Login_Page(driver); 
			return loginPage;
		}
		
		public Home_Page getHomePage()
		{
			homePage = new Home_Page(driver); 
			return homePage;
		}
		
		public Change_Password getChangePasswordPage()
		{
			change_Password = new Change_Password(driver);
			return change_Password;
		}
		
		public Self_KRA getSelfKRAPage()
		{
			self_KRA = new Self_KRA(driver);
			return self_KRA;
		}
	
	

}
