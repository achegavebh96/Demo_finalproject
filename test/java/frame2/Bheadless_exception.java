package frame2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Bheadless_exception {

	public static void main(String[] args) {

	/*	ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle()); */
		
		//--headless = browser spacific setting
		
		FirefoxOptions option= new FirefoxOptions();
		option.addArguments("--headless");

		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle()); 
		
		
		
	}
}
