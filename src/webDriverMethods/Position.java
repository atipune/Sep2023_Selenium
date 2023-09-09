package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//default browser position on launch		
		System.out.println(driver.manage().window().getPosition());
//position -1
		Point p= new Point(100,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
//position -2
		Point p2= new Point(100,500);
		driver.manage().window().setPosition(p2);
		Thread.sleep(2000);
//position -3
		Point p3= new Point(700,700);
		driver.manage().window().setPosition(p3);

		Thread.sleep(15000);
		driver.close();
	}
}
