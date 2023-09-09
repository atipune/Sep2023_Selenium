package handleTheWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe";
		String url="http://www.dypatil.edu/application-form/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("AtiPune");
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("Pramod");
		Thread.sleep(5000);
		driver.findElement(By.name("mother_tongue")).sendKeys("Marathi");
	}
}
