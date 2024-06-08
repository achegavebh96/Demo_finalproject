package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pmouse_over {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
	 WebElement webelement_desk = driver.findElement(By.xpath("//a[text()='Desktops']"));

	 WebElement webelement_mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	 
		act.moveToElement(webelement_desk).build().perform();
		
	//	act.moveToElement(webelement_desk).perform();
		Thread.sleep(2000);
		
		
		act.moveToElement(webelement_mac).build().perform();
		webelement_mac.click(); 
	}

}
//a[text()='Mac (1)']