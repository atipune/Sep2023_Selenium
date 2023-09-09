package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/table");
		Thread.sleep(2000);
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
//Print all data of row
		System.out.println("*****Row Data");
		for(WebElement data:rowData)
		{
			System.out.println(data.getText());
		}
//		
		String expValue="Facebook";
		String actValue=rowData.get(1).getText();
		if(actValue.equalsIgnoreCase(expValue))
		{
			System.out.println("Test case is pass");
		}
//print all column data
		System.out.println("*****Column Data");
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for(WebElement data:columnData)
		{
			System.out.println(data.getText());
		}
	}
}
