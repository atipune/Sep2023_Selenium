package multipleWebElements;

import java.util.List;
import java.util.Random;

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
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
//to print all header text
		List<WebElement> headers = driver.findElements(By.xpath("//form[@id='userForm']/div/div[1]/label"));
		for(WebElement header:headers)
		{
			System.out.println(header.getText());
		}
		System.out.println("****Hobies list");
//Print all checkbox text
		List<WebElement> hobieslist = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
		for(WebElement Hobby:hobieslist)
		{
			System.out.println(Hobby.getText());
		}
//select all checkbox or select any perticular option
		for(WebElement hobby:hobieslist)
		{
			if(hobby.getText().equalsIgnoreCase("Reading") || hobby.getText().equalsIgnoreCase("Music"))
			{
			hobby.click();
			Thread.sleep(2000);
			}
		}
	}
}
