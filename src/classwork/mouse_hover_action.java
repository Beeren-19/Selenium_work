package classwork;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	driver.close();
	
}
}
