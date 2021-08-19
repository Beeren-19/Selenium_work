package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample2 {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
    	
    	WebDriver driver=new FirefoxDriver();
    	
    	driver.get("file:///C:/Users/Dell/Desktop/dummy1.html");
    	
    	driver.findElement(By.name("n1")).click();
    	
	}
}
