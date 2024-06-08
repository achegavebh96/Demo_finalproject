package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Pmousebuildperformdiff {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
	 WebElement webelement_desk = driver.findElement(By.xpath("//a[text()='Desktops']"));

	 WebElement webelement_mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	 
		Action action1 = act.moveToElement(webelement_desk).build();
		
	//	act.moveToElement(webelement_desk).perform();
		Thread.sleep(2000);
		
		Action action2 = act.moveToElement(webelement_mac).build();
		
		action1.perform();
		action2.perform();
		webelement_mac.click(); 
	}

}
