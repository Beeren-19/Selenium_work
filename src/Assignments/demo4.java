package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo4 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/HTML/assignment3.html");
		WebElement ele = driver.findElement(By.xpath("//input[@id='a1']"));
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement B = driver.findElement(By.xpath("//input[@id='a2']"));
		B.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		B.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		B.sendKeys(Keys.CONTROL+"v");
	}
}
