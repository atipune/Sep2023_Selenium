package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
	//setter and getter methods
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://demoqa.com/select-menu");
			Thread.sleep(2000);
	//Cars dropdown
			WebElement carList = driver.findElement(By.xpath("//select[@id='cars']"));
			Select s = new Select(carList);
			Thread.sleep(2000);
	//select the options
			s.selectByIndex(0); 			//Volvo
			Thread.sleep(2000);
			s.selectByValue("saab"); 		//Saab
			Thread.sleep(2000);
			s.selectByVisibleText("Audi"); 	//Audi
			Thread.sleep(2000);
	//Deselct the option
			s.deselectByIndex(1); //Saab
			Thread.sleep(2000);
	//deselct all options		
			//s.deselectAll();
	//Multiple status		
			boolean listBoxStatus = s.isMultiple();
			System.out.println("Is Listbox multiselectable="+listBoxStatus);
	//get all options from list box		
			System.out.println("****List of all options in listBox =");
			List<WebElement> allOptions = s.getOptions();
			for(WebElement option:allOptions)
			{
				System.out.println(option.getText());
			}
	//getAllSelectedOptions()
			System.out.println("****All selected options from listbox =");
			List<WebElement> selectedOptions = s.getAllSelectedOptions();
			System.out.println(selectedOptions.size());
			for(WebElement option:selectedOptions)
			{
				System.out.println(option.getText());
			}
	//getFirstSelectedOption()
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println("First selected option in listBox ="+firstSelectedOption.getText());
			Thread.sleep(5000);
			driver.close();
		}
	}
