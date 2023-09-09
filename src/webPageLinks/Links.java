package webPageLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
//all links by xpath
	//	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links avaiable on Webpage ="+allLinks.size());
//		for(WebElement link:allLinks)
//		{
//		//	System.out.println(link.getText());
//		//	System.out.println(link.getText()+" --> "+link.isEnabled());
//			System.out.println(link.getText()+" --> "+link.getAttribute("href"));
//		}
		int workingLinks=0;
		int brokenLinks=0;
		for(WebElement link:allLinks)
		{
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			
			HttpURLConnection httpUrlConnect = (HttpURLConnection)url.openConnection();
			httpUrlConnect.setConnectTimeout(2000);
			httpUrlConnect.connect();
			if(httpUrlConnect.getResponseCode()==200)
			{
				System.out.println(linkURL+" --> "+"Valid link"+" --> "+ httpUrlConnect.getResponseCode()+" --> "+httpUrlConnect.getResponseMessage());
				workingLinks++;
			}
			else if(linkURL==null)
			{
				System.out.println(linkURL);
			}
			else {
				System.out.println(linkURL+" --> "+"Broken link"+ " --> "+httpUrlConnect.getResponseCode()+" --> "+httpUrlConnect.getResponseMessage());
				brokenLinks++;
			}
		}
		System.out.println("Broken Links count ="+brokenLinks);
		System.out.println("Working Links count ="+workingLinks);
	}
}
