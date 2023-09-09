package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
//Index		
		//driver.switchTo().frame(4);
//Id or name		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		String text2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text2);
	}
}
