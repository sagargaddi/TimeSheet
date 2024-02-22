package POM_Files;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page 
{
public WebDriver driver;
	
	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	private By homepage = By.xpath("//span[normalize-space()='Sync Logs']");
	
	//@SyncLogs
	private By synclogs = By.xpath("//button[@title='Sync Logs']");
	private By from = By.xpath("//input[@placeholder='From']");
	private By select_from_date = By.xpath("(//div[@class='ant-picker-cell-inner'])[3]");
	private By select_to_date = By.xpath("(//div[@class='ant-picker-cell-inner'])[18]");
	private By sync = By.xpath("//button[@data-testid='SYNC_CONFIRMATION_BUTTON']");
	
	
	//@Logout
	private By Logout = By.xpath("//a[normalize-space()='Logout']");
	
	//@Self_KRA
	private By keyButton = By.xpath("(//div[@class='ant-menu-submenu-title'])[1]");
	
	//@Login
	public void verifyHomePage()
	{
		driver.findElement(homepage).isDisplayed();
	}
	
	
	//@SyncLogs
	public void clickOnSyncLogs()
	{
		driver.findElement(synclogs).click();
	}
	
	public void clickOnFrom()
	{
		driver.findElement(from).click();
	}
	
	public void selectFromDate()
	{
		driver.findElement(select_from_date).click();
	}
	
	public void selectToDate() 
	{
		driver.findElement(select_to_date).click();
	}
	
	public void clickOnSync()
	{
		driver.findElement(sync).click();
	}
	
	public void verifySuccess()
	{
		WebElement download = driver.findElement(By.xpath("//button[@title='Download']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(download));
	}
	
	
	//@Logout
	
	public void clickOnLogout()
	{
		driver.findElement(Logout).click();
	}
	
	
	//@Self_KRA
	public void clickOnKey()
	{
		driver.findElement(keyButton).click();
	}
	
	public void clickOnAssignment() 
	{
		WebElement assignment = driver.findElement(By.xpath("//li[1]//div[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(assignment));
		Actions action = new Actions(driver);
		action.moveToElement(assignment).click().build().perform();
	}
	
	public void clickOnKRA()
	{
		WebElement KRA = driver.findElement(By.xpath("//a[normalize-space()='Self KRA']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(KRA));
		Actions action = new Actions(driver);
		action.moveToElement(KRA).click().build().perform();
	}
		
}
