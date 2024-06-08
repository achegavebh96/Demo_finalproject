package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinkalrt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement alrt=driver.findElement(By.id("alertbtn"));
		alrt.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		//exception 
		//driver.switchTo().alert().dismiss();
		//exception
		//driver.findElement(By.id("openwindow")).click();

	}

}
