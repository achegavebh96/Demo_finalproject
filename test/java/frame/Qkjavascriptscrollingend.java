package frame;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Qkjavascriptscrollingend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	//js.executeScript("window.scrollBy(0,300)");
	//Thread.sleep(2000);
	//js.executeScript("window.scrollBy(0,-300)");
	
	}

}
