package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Psliderloction {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex='0']"));
		System.out.println("default location slider:"+slider.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("max location slider:"+slider.getLocation());
		
		driver.manage().window().minimize();
		System.out.println("min location slider:"+slider.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("full location slider"+slider.getLocation());
		
		Dimension d =new Dimension(500, 500);
		driver.manage().window().setSize(d);
		System.out.println("Set size: "+d);
		
		Point P=new Point(400,400);
		driver.manage().window().setPosition(P);
		System.out.println("set location slider"+slider.getLocation());

		//Actions act=new Actions(driver);

	}

}
