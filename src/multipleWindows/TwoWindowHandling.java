package multipleWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.findElement(By.xpath("//p[@id='loginbtns']/a[1]/img")).click();
		Thread.sleep(2000);
		Set<String> WindowIDs = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(WindowIDs);
		for(String id:WindowIDs)
		{
			System.out.println(id);
		}
		System.out.println(al);
		System.out.println(al.get(1).toString());
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='userLogin:captchaInput']")).sendKeys("AtiPune");
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//a[text()='Utility Bill Payment']")).click();
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
}
