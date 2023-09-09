package multipleWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Utility Bill Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Lic Premium Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Railway Reservation ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='SBI Credit Card Payment']")).click();
		Thread.sleep(2000);
		Set<String> windowIDs = driver.getWindowHandles();
//		ArrayList<String> al= new ArrayList<String>(windowIDs);
		System.out.println(windowIDs);
//		System.out.println(al);
		
		for(String id:windowIDs)
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
	}
}
