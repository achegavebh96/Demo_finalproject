package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qkjavascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//driver= webdriver instance
		WebDriver driver=new ChromeDriver(); 
		
	//	ChromeDriver driver= new ChromeDriver(); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// entering text
		WebElement textfield1 = driver.findElement(By.xpath("//input[@id='name']"));
		
		//(javascripte)= JavascriptExecutor instance
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	   JavascriptExecutor js=driver; 
		
		js.executeScript("arguments[0].setAttribute('value','hello')",textfield1 );
	Thread.sleep(3000);
		//clicking text
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']"));
		
		js.executeScript("arguments[0].click();", button);
		
		
	}

}
