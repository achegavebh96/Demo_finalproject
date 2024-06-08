package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prdouble_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//	https://testautomationpractice.blogspot.com/
		//button[text()='Copy Text']
		
		Actions act=new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Thread.sleep(2000);
		act.doubleClick(doubleclick).build().perform();
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		String f1 = field1.getAttribute("value");
		
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		String f2 = field2.getAttribute("value");
		
		System.out.println("text f1: "+f1);
		System.out.println("text f2: "+f2);

		
		if(f1.equals(f2))
		
			System.out.println("text is pass");
			
			else
				System.out.println("text is failed");
		
			
			
	}

}
