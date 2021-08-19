package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo10 {
      public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/HTML/practice.html");
		
		driver.findElement(By.tagName("input")).sendKeys("hai iam beera");
		driver.findElement(By.cssSelector("input[id='a2']")).clear();
		driver.findElement(By.name("n3")).click();
		driver.findElement(By.className("c4")).click();
		driver.findElement(By.linkText("google")).click();
		
	}
		
	}

