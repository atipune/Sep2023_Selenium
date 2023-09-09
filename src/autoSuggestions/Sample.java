package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Samsung");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='eIPGRd']/div[2]/div[1]/div[1]/span"));
		System.out.println(options.size());
//Print all options
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
//click on a option		
		String expText="Samsung Galaxy A14";
		for(WebElement option:options)
		{
			String actText = option.getText();
			if(expText.equals(actText))
			{
				option.click();
				break;
			}
		}
	}
}
