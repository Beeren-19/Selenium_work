package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("beerendra.rpee10@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	}
}
