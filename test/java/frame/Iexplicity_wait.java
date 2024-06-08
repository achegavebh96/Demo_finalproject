package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iexplicity_wait {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//expicity wait 
		
		//declartion
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(60));
		
		//use
		WebElement link1 = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OrangeHRM, Inc']")));
		
		//WebElement link1 = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='OrangeHRM, Inc']")));

		link1.click();
		
		driver.quit();
		
		//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
	}

}
