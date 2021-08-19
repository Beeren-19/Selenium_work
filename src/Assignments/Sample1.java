package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("file:///C:/Users/Dell/Desktop/HTML/textbox.html");
	List<WebElement> text = driver.findElements(By.xpath("//input"));
	int count = text.size();
	for(WebElement we:text)
	{
		we.sendKeys("hai");
		Thread.sleep(1000);
	}
	for(int i=count-1;i>=0;i--)
	{
		WebElement we1 = text.get(i);
		we1.clear();
		Thread.sleep(1000);
		
	}
	
}
}
