package launchTheBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver"; //browser property
		String value="C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe"; //browser driver file path
		System.setProperty(key, value); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
