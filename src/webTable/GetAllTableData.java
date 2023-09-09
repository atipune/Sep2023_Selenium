package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTableData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/table");
		List<WebElement> tableData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement data:tableData)
		{
			System.out.println(data.getText());
		}
//rows Count
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println("Row count ="+row.size());
//column count		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		System.out.println("Column count ="+column.size());
	}
}
