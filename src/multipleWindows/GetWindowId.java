package multipleWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.mahaconnect.in/jsp/index.html");
		Thread.sleep(2000);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.navigate().refresh();
		String windowID2 = driver.getWindowHandle();
		System.out.println(windowID2);
		Thread.sleep(10000);
		driver.close();
	}
}
