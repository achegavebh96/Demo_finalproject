package frame;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rfinding_brokenlink {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		int brokenurl=0;
		for(WebElement linkelement:links)
		{
			String stringurl = linkelement.getAttribute("href");
			
			if(stringurl==null || stringurl.isEmpty())
			{
				System.out.println("href valu is empty");
				continue;
			}
			
			URL url=new URL(stringurl);
			URLConnection connection1 = url.openConnection();
			
			HttpURLConnection connection2=(HttpURLConnection) connection1;
			connection2.connect();
			System.out.println(connection2.getResponseCode());
			
			if(connection2.getResponseCode()>400)
			{
				System.out.println(stringurl + "link is broken");
				brokenurl++;
				
			}
			
			else
				System.out.println(stringurl + "link is not broken");
			
		}
		
			System.out.println(brokenurl);
	}

}
