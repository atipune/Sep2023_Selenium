package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotOfWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='password']"));
		File src = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		String s1 = RandomString.make(5);
		
		File dest = new File("C:\\Ne\\June2023_Selenium\\screenshot\\"+s1+".jpg");
		FileHandler.copy(src, dest);
	}
}
