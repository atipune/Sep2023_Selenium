package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/selectable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//webelement
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//li[text()='Item 5']")).click();
		Thread.sleep(2000);
//To switch focus to homepage form any frame		
	//	driver.switchTo().defaultContent();
//To switch focus to parent		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//li[@class='menu-item'])[1]")).click();
	}
}
