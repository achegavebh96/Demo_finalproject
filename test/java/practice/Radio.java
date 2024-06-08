package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	/*	List<WebElement> rb= driver.findElements(By.xpath("//input[@name='radioButton']"));
		
		for(int i=0; i<rb.size(); i++)
		{
			rb.get(i).click();
		Thread.sleep(2000);
		}
		
		for(WebElement k: rb)
		{
			k.click();
			Thread.sleep(2000);

		}*/
		
		
		WebElement r1=driver.findElement(By.xpath("//input[@value='radio1']"));
		r1.click();
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isEnabled());
		System.out.println(r1.isSelected());
		
		WebElement r2=driver.findElement(By.xpath("//input[@value='radio2']"));
		r2.click();
		System.out.println(r1.isSelected());
		System.out.println(r2.isSelected());
		
		boolean output= r1.isSelected();
		
		if(output==false)
		{
			System.out.println("radio button working proparly");
		}

		
	} 

}
