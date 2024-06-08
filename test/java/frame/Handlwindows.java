package frame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlwindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		/*WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("abcdef");*/
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
	/*	List<String> mylist=new ArrayList(windows);
		String parent_window=mylist.get(0);
		String child_window=mylist.get(1);
		
		driver.switchTo().window(child_window);
		
		System.out.println("click on book demo button");
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();*/
		
		for(String wh:windows)
		{
			String pagetitle=driver.switchTo().window(wh).getTitle();
			if(pagetitle.equals("Human Resources Management Software | OrangeHRM"))
				//if(pagetitle.equals("B"||"c"))
			{
				System.out.println("click on book demo button");
				driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();

			}
			
		}
		
		//driver.close();
		driver.quit();
	}

}
