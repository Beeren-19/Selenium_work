package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Desktop/HTML/chbox.html");
	
	List<WebElement> chbox = driver.findElements(By.xpath("//input"));
	int count = chbox.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement we = chbox.get(i);
		we.click();
		Thread.sleep(1000);
	}
	for(int i=count-1;i>=0;i--)
	{
		WebElement we1 = chbox.get(i);
		we1.click();
		Thread.sleep(1000);
	}
}
}
