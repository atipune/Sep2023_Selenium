package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
//1. typecast driver into TakesScreenshot interface		
		TakesScreenshot ts = (TakesScreenshot)driver;
//2. Call the getScreenshotAs() methods and pass the OutputType.FILE parameter then screenshot will be captured and stored in temporary folder		
		File srcLocation = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(srcLocation);
//3. We have to set a desired location where screenshot need to be stored
		File destLocation = new File("C:\\Ne\\June2023_Selenium\\screenshot\\ss.jpg");
//4. With FileHandler class method copy the file from Temp location to desired location
		FileHandler.copy(srcLocation, destLocation);
	}
}
