package webDriverMethods;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//default browser size on launch		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
//set -1		
		Dimension d1=new Dimension(350, 100); //width-516,height-140		
		driver.manage().window().setSize(d1);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
//set -2
		Dimension d2= new Dimension(700,700);
		driver.manage().window().setSize(d2);
		Thread.sleep(2000);
//set -3
		Dimension d3= new Dimension(1000,400);
		driver.manage().window().setSize(d3);
		
		Thread.sleep(15000);
		driver.close();
	}
}
