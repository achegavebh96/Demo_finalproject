package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver obj=new ChromeDriver();
		obj.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		obj.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement firstname=obj.findElement(By.id("name"));// locating tech to identify the firstname
		firstname.click();
		firstname.sendKeys("priya");
		Thread.sleep(2000);
		
		WebElement secn=obj.findElement(By.id("email"));
		secn.click();
		secn.sendKeys("achegavebh96@gmail.com");
		Thread.sleep(2000);

		WebElement thard=obj.findElement(By.id("mobile"));
		thard.click();
		thard.sendKeys("7972522312");

				
	}
}
