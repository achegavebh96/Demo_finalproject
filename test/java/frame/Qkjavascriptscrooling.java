package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Qkjavascriptscrooling {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
			
		JavascriptExecutor js=(JavascriptExecutor) driver;
			
			//js.executeScript("window.scrollBy(0,300)");
			
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
			
		js.executeScript("arguments[0].scrollIntoView()", draggable);
			
	}

}
