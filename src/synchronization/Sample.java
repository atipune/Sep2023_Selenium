package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://softwaretestingo.blogspot.com/2020/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
//		Thread.sleep(5000);
//Explicit wait		
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		Boolean textPresent = ewait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@onclick='timedText()']/following::p"), "Manual Testing"));
		String text = driver.findElement(By.xpath("//button[@onclick='timedText()']/following::p")).getText();
		System.out.println(textPresent);
		System.out.println(text);
		
	}
}
