package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlAutosatuationdropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement countrydrop= driver.findElement(By.id("autosuggest"));
		countrydrop.sendKeys("ind");
		Thread.sleep(1000);

	List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item'][2]"));
		
	/*	for(int i=0; i<options.size(); i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("india"))
			{
				options.get(i).click();
			}
		}*/
		
		countrydrop.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		countrydrop.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);

		countrydrop.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[@class='red-arrow-btn'])[1]")).click();
		Thread.sleep(1000);

		WebElement departurecity=driver.findElement(By.xpath("//a[@value='GWL']"));
		departurecity.click();
		Thread.sleep(1000);

		WebElement aarivcity=driver.findElement(By.xpath("(//a[@value='IXJ'])[2]"));
		aarivcity.click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//td[@data-month='3']"));
		
		for(int i=0; i<dates.size(); i++)
		{
			System.out.println(dates.get(i).getText());

			if(dates.get(i).getText().equalsIgnoreCase("23"))
			{
				//System.out.println(dates.get(i).getText());
				dates.get(i).click();
				Thread.sleep(1000);

				break;
			}
		}
		
		WebElement passanger=driver.findElement(By.id("divpaxinfo"));
		passanger.click();
		Thread.sleep(1000);
		/*WebElement adultbox=driver.findElement(By.xpath("(//label[@class='guestlbl'])[1]"));
		Thread.sleep(2000);*/

	/*	List<WebElement>adult =driver.findElements(By.id("hrefIncAdt"));
		
		for(int i=0; i<adult.size(); i++)
		{
			adult.get(i).click();
		}*/
			WebElement adult =driver.findElement(By.id("hrefIncAdt"));

			adult.click();
			adult.click();
			adult.click();
			adult.click();

				adult.click();
				adult.click();
				adult.click();
				adult.click();
				adult.click();

			Thread.sleep(2000);
			
		//WebElement alrt=driver.findElement(By.id("divpaxOptions"));
		//alrt.click();
			
		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);
		driver.switchTo().alert().accept();


		WebElement child=driver.findElement(By.id("hrefIncChd"));
        child.click();
		Thread.sleep(2000);

		WebElement infant=driver.findElement(By.id("hrefIncInf"));
		infant.click();
		
		WebElement done=driver.findElement(By.id("btnclosepaxoption"));
		done.click();
		Thread.sleep(2000);

		WebElement currancy=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select obj=new Select(currancy);
		obj.selectByValue("AED");
		Thread.sleep(2000);

		
	}
	

}
