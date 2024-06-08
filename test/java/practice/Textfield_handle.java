package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the chromebrowser 
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://login.salesforce.com/?locale=in");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait method
		Thread.sleep(3000);
		
		// locate the username
		WebElement user=driver.findElement(By.xpath("//label[@for='username']"));
		
		// username is visable or not 
		System.out.println(user.isDisplayed());
		Thread.sleep(3000);

		//username= fetch the data
		System.out.println(user.getText());
		Thread.sleep(3000);

		//locate the usertextfield
		WebElement userTextfield =driver.findElement(By.xpath("//input[@id='username']"));

		// userTextfield is display or not 
		System.out.println(userTextfield.isDisplayed());

		// userTextfield is enable or not 
		System.out.println(userTextfield.isEnabled()); 
		Thread.sleep(3000);

		// is accepting data or not
		userTextfield.sendKeys("salesforce");
		Thread.sleep(3000);

		//fetch the data using gettext 
		System.out.println(userTextfield.getText());
		Thread.sleep(3000);
		
		//to get value of textbox
		System.out.println(userTextfield.getAttribute("value")); //retrive input on console print salesforce
		Thread.sleep(3000);

		//clear the data
		userTextfield.clear();
		
	}

}
