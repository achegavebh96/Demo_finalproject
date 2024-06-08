package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec {

	public static void main(String[] args) throws InterruptedException {

		WebDriver obj=new ChromeDriver();
		
		obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		obj.manage().window().minimize();
		Thread.sleep(2000);
		
		System.out.println("url for 1st page="+obj.getCurrentUrl());
		System.out.println("Title for 1st page="+obj.getTitle());
		System.out.println(obj.getWindowHandle());
		
	//	https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php
		obj.manage().window().maximize();
		 Thread.sleep(2000);
		
		obj.navigate().refresh();
		 Thread.sleep(2000);
		 
		 obj.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		 Thread.sleep(2000);
		 
			System.out.println("url for 2nd page="+ obj.getCurrentUrl());
			System.out.println("Titlr for 2nd page="+ obj.getTitle());
			System.out.println(obj.getWindowHandle());
			
		 obj.navigate().back();
		 Thread.sleep(2000);
		 
		 obj.navigate().forward();
		 Thread.sleep(2000);

		 obj.quit();

	}

}
