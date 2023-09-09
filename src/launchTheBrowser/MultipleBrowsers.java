package launchTheBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String browserName="htmlUnitDriver";
	
		if(browserName.equalsIgnoreCase("Chrome"))
		{
	//1. Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
	//2. Firefox-GeckoDriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Ne\\June2023_Selenium\\drivers\\geckodriver.exe"); //--> selenium capabilities need to set 
		System.setProperty("webdriver.firefox.marionette", "C:\\Ne\\June2023_Selenium\\drivers\\geckodriver.exe");	
		driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
	//3.	EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\Ne\\June2023_Selenium\\drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("htmlUnitDriver"))
		{
	//4.	htmlUnitDriver - headless browser
			driver=new HtmlUnitDriver();
		}
		
		else if(browserName.equalsIgnoreCase("PhantomJS"))
		{
	//5.	PhantomJS - headless browser
//			File file=new File("C:\\Ne\\June2023_Selenium\\JarFiles\\phantomjs.exe");
//			System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
//			new phanto
		}
		
		else if(browserName.equalsIgnoreCase("Safari"))
		{
	//6.	Safari
			//no need to set property
			driver=new SafariDriver();
		}
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			String titleText = driver.getTitle();
			System.out.println(titleText);
		
	}
}
