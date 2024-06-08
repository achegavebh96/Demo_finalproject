package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_method {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().to("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&hvadid=590652406969&hvdev=c&hvlocphy=9152165&hvnetw=g&hvqmt=e&hvrand=14501332256937754811&hvtargid=kwd-837441119212&hydadcr=24542_2265395&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_e");
		Thread.sleep(2000);

		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.close();
	}

}
