package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handl_webelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/\r\n");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowcount=rows.size();
		System.out.println("rowsize: "+rowcount);
		
		
		//List<WebElement> colum = driver.findElements(By.xpath("//table[@name='BookTable']//table//tr//th"));
		List<WebElement> colum = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		//List<WebElement> colum = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		int columcount=colum.size();
		System.out.println("columsize:  "+columcount);
		//System.out.println("colum size: "+colum.size());
		
		//print dataname or text in colum or rows
	    WebElement data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]"));
		String dataname = data1.getText();
		System.out.println(dataname);
		/*WebElement data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]"));
		data1.getText();*/
		
for(int r=2; r<=rowcount; r++)
	{
		for(int c=1; c<=columcount; c++)
		{
		 WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
					String alldata = data.getText();
					//System.out.print("all data print: ");
					System.out.print(alldata +"                      ");
			}
		System.out.println("   ");
		}

		// print bookname whoes auther name is amit
		WebElement book_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]"));
		book_name.getText();
		System.out.println(book_name.getText());
		
		for(int i=2; i<=rowcount; i++)
		{
			
			//System.out.println("print auther name");
			WebElement auther = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]"));
			 String autherna = auther.getText();
			//System.out.println(autherna);
			
		if(autherna.equals("Amit"))
			{
			System.out.println("print book name");
				WebElement book_name2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]"));
				String bookname = book_name2.getText();
				System.out.println(bookname);
				
			}
			
		}

		System.out.println("  ");
		
		int sum=0;
		for(int j=2; j<=rowcount; j++)
		{
			 String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[4]")).getText();
			 int total=Integer.parseInt(price);
			 
			 sum=total+sum;
				System.out.println("print totalprice:  "+ sum);

		}
		
		//System.out.println("print totalprice:  "+ sum);
		}
		
	}

