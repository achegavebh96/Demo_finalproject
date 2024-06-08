package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
   /*   WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
		//link1.click();
		Thread.sleep(3000);
		
		System.out.println(link1.isDisplayed());
		Thread.sleep(3000);

		System.out.println(link1.isEnabled());
		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		link1.click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
		Thread.sleep(2000);
		
		link2.click();
		
		System.out.println(link2.isDisplayed());
		Thread.sleep(2000);

		System.out.println(link2.isEnabled());
		Thread.sleep(2000);

		System.out.println(driver.getTitle());*/

		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
