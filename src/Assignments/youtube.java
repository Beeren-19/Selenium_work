package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
    public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://youtube.com");
	   driver.findElement(By.id("search")).sendKeys("KGF trailer kannada");
	   driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	   driver.findElement(By.xpath("//div[@id='title-wrapper']")).click();
	   driver.findElement(By.id("interaction")).click();
	   
	}
    
}
