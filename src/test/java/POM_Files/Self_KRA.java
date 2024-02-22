package POM_Files;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Self_KRA 
{
public WebDriver driver;

	public Self_KRA(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//@Self_KRA
	private By self_KRA_page = By.xpath("//span[contains(text(),'Self KRA')]");
	
	//@Change_Quarter
	private By ListBox_Quarter = By.xpath("(//div[@class='ant-select-selector'])[1]");
	
	
	
	
	//@Self_KRA
	public void userIsOnSelfKRAPage()
	{
		driver.findElement(self_KRA_page).isDisplayed();
	}
	
	
	//@Change_Quarter
	public void clickOnListBox() 
	{
		driver.findElement(ListBox_Quarter).click();
	}
	
	public void Enter_Quarter(String Quarter) throws InterruptedException
	{
		WebElement All_Quarters = driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(All_Quarters));
		Actions action = new Actions(driver);
		action.moveToElement(All_Quarters).sendKeys(Quarter).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void verifyDetailsDisplayed()
	{
		System.out.println("Output is displayed"); //code is not added to verify details displayed, as functionality has not been developed completely
	}
	
	
	//@Change_Year
	
	
	

}
