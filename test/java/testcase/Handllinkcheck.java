package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handllinkcheck {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	List<WebElement> checkButton=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		 for(int i=0; i<checkButton.size(); i++)
		{
			checkButton.get(i).click();
		System.out.println("check "+ (i+1)+"is display"+ checkButton.get(i).isDisplayed());
			Thread.sleep(2000);
		}
		
		/*for(WebElement j: checkButton)
		{
			j.click();
			Thread.sleep(2000);
		}*/
		

	/*	WebElement check1=driver.findElement(By.xpath("//input[@value='option1']"));
		check1.click();
		
		System.out.println(check1.isDisplayed());
		System.out.println(check1.isEnabled());
		System.out.println(check1.isSelected());
		
		
		WebElement check2=driver.findElement(By.xpath("//input[@value='option2']"));
		check2.click();
		System.out.println(check1.isSelected());
		System.out.println(check2.isSelected());

		WebElement check3=driver.findElement(By.xpath("//input[@value='option3']"));
		check3.click();
		System.out.println(check1.isSelected());
		System.out.println(check2.isSelected());
		System.out.println(check3.isSelected());

		boolean var=check2.isSelected();
		
		if(var==true)
		{
			System.out.println("checkButton functionality working fine");
		}*/
		
		}
	}

