 package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handllinkRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
	List<WebElement> radioButton=driver.findElements(By.xpath("//input[@name='radioButton']"));
	
			for(int i=0; i<radioButton.size(); i++)
			{
				radioButton.get(i).click();
				Thread.sleep(2000);
			}

			for(WebElement j: radioButton)
			{
				j.click();
				Thread.sleep(2000);
			}
	
	/*	WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1.click();
		
		System.out.println(radio1.isDisplayed());
		System.out.println(radio1.isEnabled());
		System.out.println(radio1.isSelected());

		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();
		//System.out.println(radio1.isSelected());
		 boolean var=radio1.isSelected();
		System.out.println(radio2.isSelected());
		
		if(var==false)
		{
			System.out.println("radiobutton functionality working fine");
		}*/

	}

}
