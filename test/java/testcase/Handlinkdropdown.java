package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinkdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		
		Select obj=new Select(dropDown);
		obj.selectByIndex(1);
		Thread.sleep(2000);

		obj.selectByValue("option2");
		Thread.sleep(2000);

		obj.selectByVisibleText("Option3");
		//Thread.sleep(2000);

			List<WebElement> option=obj.getOptions();
			for(int i=0; i<option.size(); i++) 
			{
				System.out.println( option.get(i).getText());
			}
			
			//for each loop
			for(WebElement j: option)
			{
				System.out.println(j.getText());
			}
		
	}

}
