package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9164991755");
		Thread.sleep(3000);
		
		driver.findElement(By.id("pass")).sendKeys("Beeren@1901");
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click(); 
	}
}
