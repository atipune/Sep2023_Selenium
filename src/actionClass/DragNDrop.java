package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);
		WebElement dragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropEle = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions act= new Actions(driver);
		//act.moveToElement(dragEle).clickAndHold().moveToElement(dropEle).release().build().perform();
		act.clickAndHold(dragEle).release(dropEle).build().perform();
		//act.dragAndDrop(dragEle, dropEle).perform();
	}
}

