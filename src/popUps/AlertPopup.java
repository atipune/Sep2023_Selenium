package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
//1. Alert Popup		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println("Text on alert="+text);
		Thread.sleep(2000);
		alt.accept();
//2. Confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);		
		Alert confAlert = driver.switchTo().alert();
		String confText = confAlert.getText();
		System.out.println("Confirm alert Text="+confText);
		//confAlert.accept()
		confAlert.dismiss();
//3. prompt alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert promtAlert = driver.switchTo().alert();
		String promtAlertText = promtAlert.getText();
		System.out.println("promt Alert Text="+promtAlertText);
		promtAlert.sendKeys("Hi AtiPune");
		Thread.sleep(2000);
		//promtAlert.accept()  //-->ok Button
		promtAlert.dismiss();  //--> cancel button
		
		String alertText1 = driver.findElement(By.xpath("(//span[@class='mr-3'])[1]")).getText();
		System.out.println("Text on webpage ="+alertText1);
	}
}
