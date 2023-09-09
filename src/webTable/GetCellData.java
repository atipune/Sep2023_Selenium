package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCellData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/table");
		Thread.sleep(2000);
		
		String expValue="Selenium Webdriver";
		
		String actValue = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.println(actValue);
		if(actValue.equalsIgnoreCase(expValue))
		{

			System.out.println("Test case is pass");
		}
	}
}
