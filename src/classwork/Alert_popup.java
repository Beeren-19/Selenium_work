package classwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_popup {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("hello");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert a = driver.switchTo().alert();   //switch control from page to pop-up
	String text = a.getText();
	System.out.println(text);
	a.accept();
	Thread.sleep(2000);
	a.accept();
	
	
}
}
