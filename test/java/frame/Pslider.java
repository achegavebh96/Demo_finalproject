package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pslider {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		Actions act=new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex='0']"));
		Point xy = slider.getLocation();
		System.out.println(xy);
		System.out.println("default location slider"+slider.getLocation());
		
		act.dragAndDropBy(slider, 61, 0).build().perform();
		System.out.println("location after slider"+slider.getLocation());

	}

}
