package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinglink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		// driver.findElement(By.linkText("Forgot Your Password?")).click();
		WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
	//	WebElement link1=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
	//  link1.click();
		System.out.println(link1.isDisplayed());
		System.out.println(link1.isEnabled());
		link1.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);

		//driver.findElement(By.partialLinkText("Use Custom")).click();
		//link2.click();
		WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
		//link2.click();
		System.out.println(link2.isDisplayed());
		System.out.println(link2.isEnabled()) ;
		link2.click();


	}

}
