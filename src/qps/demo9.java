package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {
   public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("file:///C:/Users/Dell/Desktop/dummy1.html");
	   
	   driver.findElement(By.tagName("a")).click();
	   
	   
}
}
