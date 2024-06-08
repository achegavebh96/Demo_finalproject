package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pright_click {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//span[text()='right click me']
		
		Actions act=new Actions(driver);
		
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(right_click).build().perform();
	}

}
