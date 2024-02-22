package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Global.properties");
		Properties Prop = new Properties();
		Prop.load(fis);
		String url = Prop.getProperty("QAURL");
		
		//command line prompt - change browser without making changes to actual code
		String browser_properties = Prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
				
		String browser = browser_maven!=null ? browser_maven : browser_properties; //if no value is assigned to browser_maven in command prompt or maven in eclipse, browser_properties will take priority, if not, browser_maven will be given priority
				
		
		if(driver == null) //to avoid re-initialization of browser
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "D:\\chrome.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
						
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			
		}
			
			return driver;
	}

}
