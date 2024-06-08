package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//switching to frame1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		//performing action
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("priya");
		
		//default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//switching to frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		//performing action
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("priya2");
		
		//switching to iframe
		WebElement IFRAME = driver.findElement(By.xpath("//p[text()='iframe inside frame:']//following::iframe"));
		driver.switchTo().frame(IFRAME);
		Thread.sleep(2000);
		
		//performing action on checkbox
		driver.findElement(By.xpath("//div[@aria-label='Web Testing']")).click();
	}
}
