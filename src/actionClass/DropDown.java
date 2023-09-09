package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement closeBtnPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtnPopup.click();
		Thread.sleep(2000);
		WebElement electronicsCategory = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[4]"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(electronicsCategory).perform();
		WebElement LaptopNDesktop = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		Thread.sleep(2000);
		act.moveToElement(LaptopNDesktop).perform();
		List<WebElement> subCategoryList = driver.findElements(By.xpath("//div[@class='_3XS_gI']/a"));
		for(WebElement subCategoryItem:subCategoryList)
		{
			System.out.println(subCategoryItem.getText());
			String actText = subCategoryItem.getText();
			String expText= "Mini PCs";
			act.moveToElement(subCategoryItem).perform();
			if(actText.equals(expText))
			{
			//	subCategoryItem.click();
				act.click().perform();
				break;
			}
			Thread.sleep(2000);
		}
	}
}
