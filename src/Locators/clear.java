package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/dummy2.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).clear();
	}
}
