package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctic {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/");
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	System.out.println(driver.getTitle());
	Thread.sleep(2000);

	}
}
