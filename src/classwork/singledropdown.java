package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:/Users/Dell/Desktop/HTML/dropdown.html");
	
	WebElement ele = driver.findElement(By.id("empire"));
	Select s=new Select(ele);
	s.selectByIndex(0);
	Thread.sleep(2000);
	boolean b = s.isMultiple();
	if(b)
	{
		System.out.println("multi select dropdown");
	}
	else
	{
		System.out.println("single select dropdown");
	}
}
}
