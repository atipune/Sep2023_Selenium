package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//1. Launch the facebook		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//2 click on crete new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
//3 first name
		driver.findElement(By.name("firstname")).sendKeys("Pramod");
		Thread.sleep(2000);
//4. surname
		driver.findElement(By.name("lastname")).sendKeys("Mane");
		Thread.sleep(2000);
//5. mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8766060616");
		Thread.sleep(2000);
//6. password
		driver.findElement(By.id("password_step_input")).sendKeys("AtiPune@123");
		Thread.sleep(2000);
//7. gender
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		Thread.sleep(2000);
//8. Linktext
		driver.findElement(By.linkText("/help/637205020878504")).click();
		Thread.sleep(2000);
//9. partialLinkText
		driver.findElement(By.partialLinkText("/policies/")).click();
		Thread.sleep(2000);
//8. SignUp button		
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(15000);
		driver.close();
		}
}
