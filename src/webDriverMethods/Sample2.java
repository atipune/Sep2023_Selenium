package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://www.amazon.in/");
//getTitle()	
		String title = driver.getTitle();
		System.out.println(title);
//getCurrentUrl()
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
//getPageSource()
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		Thread.sleep(2000);
//manage()
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
//close()
		driver.close();
//quit()
		//driver.quit();
	}
}
