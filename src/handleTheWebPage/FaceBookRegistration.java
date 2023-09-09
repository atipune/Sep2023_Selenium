package handleTheWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRegistration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Ne\\June2023_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createAccBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

//click the button		
		createAccBtn.click();
		Thread.sleep(2000);
//SendKeys
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Pramod");
		Thread.sleep(2000);
//clear
		firstName.clear();
		Thread.sleep(2000);
//SendKeys
		firstName.sendKeys("AtiPune");
		Thread.sleep(2000);
//getText
		String text = driver.findElement(By.xpath("(//p[@class='_58mv'])[1]")).getText();
		System.out.println("UI text ="+text);
		Thread.sleep(2000);
//getAttribute
		String attri = firstName.getAttribute("class");
		System.out.println("Attribute of first name textbox ="+attri);
		Thread.sleep(2000);
//getTagName
		String tag = firstName.getTagName();
		System.out.println("Tagname of first name textbox ="+tag);
		Thread.sleep(2000);
//getLocation()
		Point location=driver.findElement(By.xpath("//input[@data-type='password']")).getLocation();
		System.out.println("Password field location = "+location);
		int x = location.getX();
		System.out.println("Password field x coordinate = "+x);
		int y = location.getY();
		System.out.println("Password field y coordinate = "+y);
//getSize()
		Dimension firstN = firstName.getSize();
		System.out.println("Dimensions of first Name Text box ="+firstN);
		System.out.println("FirstName textbox height ="+firstN.getHeight());
		System.out.println("FirstName textbox width ="+firstN.getWidth());
//isSelected()	
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		System.out.println("Female radio button status ="+female.isSelected());  //false
		female.click();
		System.out.println("Female radio button status ="+female.isSelected()); //true
//isDisplayed() //logo or image display status
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click(); //popup window close
		Thread.sleep(2000);
		boolean logoStatus = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println("Logo display status ="+logoStatus);
//isEnabled()
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		boolean btnStatus = loginbtn.isEnabled();
		System.out.println("login Button enabled status ="+btnStatus);
//submit()  //this will work only for button having submit as any attribute value
		//loginbtn.submit();
		loginbtn.click();
	}
}
