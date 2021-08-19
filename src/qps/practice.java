package qps;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {
   public static void main(String[] args) throws InterruptedException, AWTException {
	  System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("9164991755");
	driver.findElement(By.id("pass")).sendKeys("Beeren@1901");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("//a[@aria-label='Pages']")).click();
	driver.findElement(By.xpath("//a[@aria-label='Watch']")).click();
	driver.findElement(By.xpath("//a[@aria-label='Marketplace']")).click();
	driver.findElement(By.xpath("//a[@aria-label='Groups']")).click();
	
}
}
