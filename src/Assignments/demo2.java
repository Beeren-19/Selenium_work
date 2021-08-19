package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/HTML/Assignment2.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("a2")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("n2")).sendKeys("how are you");
		Thread.sleep(2000);
		
		driver.findElement(By.className("c3")).click();
	}
     
}
