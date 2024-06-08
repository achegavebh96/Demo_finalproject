package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechn {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Nametext

		WebElement nameText=driver.findElement(By.xpath("//label[@for='name']"));
		System.out.println(nameText.isDisplayed()); // Name text is visible or not 
		System.out.println(nameText.getText()); //check spelling
		Thread.sleep(3000);

		//Nametextfield
		
		WebElement nameTextField= driver.findElement(By.id("name"));
		System.out.println(nameTextField.isDisplayed()); // Name text is visible or not 
		System.out.println(nameTextField.isEnabled()); // Name text is enabled or not 
		nameTextField.sendKeys("priya");
		Thread.sleep(3000);

		// emailText
		WebElement emailText= driver.findElement(By.xpath("//label[@for='email']"));
		System.out.println(emailText.isDisplayed());
		System.out.println(emailText.getText());
		
		//emailTextField
		WebElement emailTextField= driver.findElement(By.xpath("//input[@id='email']"));
		// to check disple or not
		System.out.println(emailTextField.isDisplayed());
		// to check enable or not
		System.out.println(nameText.isEnabled()); // Name text is visible or not 
		// to enter text
		emailTextField.sendKeys("achegavebh@gmail.com");
		// to retrive the data
		System.out.println(emailTextField.getText());
		Thread.sleep(4000);
		//emailTextField.clear();
		System.out.println(emailTextField.getAttribute("value")); // retrive input on console print achegavebh@gmail.com


	}

}
