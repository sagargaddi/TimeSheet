package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import POM_Files.PageObjectManager;

public class TestContextSetup 
{
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		
	}
	

}
