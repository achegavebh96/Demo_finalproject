package frame2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aspacificelement_screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement screen = driver.findElement(By.xpath("//div[@id='Wikipedia1']"));
		 
		File source = screen.getScreenshotAs(OutputType.FILE);
		File target= new File("C:\\Users\\BHAGYASHRI\\eclipse-workspace\\Autmoationproj\\Screenshot\\pqr.png");
		//File target= new File("./Screenshot/pqr.png");

		FileUtils.copyFile(source, target);
		//driver.close();
	
	}
}
