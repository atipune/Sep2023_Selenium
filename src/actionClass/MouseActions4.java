package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//tool tip
public class MouseActions4 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		WebElement TowerImage = driver.findElement(By.xpath("//img[@alt='Tower Bridge']"));
		Actions act = new Actions(driver);
		act.moveToElement(TowerImage).perform();
		Thread.sleep(2000);
		String tooltipText = driver.findElement(By.xpath("//div[@role='tooltip']/div")).getText();
		System.out.println(tooltipText);
	}
}
