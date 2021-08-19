package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo8 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/dummy1.html");
		
	        WebElement ele = driver.findElement(By.tagName("a"));
	        
	        Thread.sleep(2000);
	             
	        ele.click();
	}
}
