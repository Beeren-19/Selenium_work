package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_frame {
     public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/HTML/mainpage.html");
		driver.findElement(By.id("t1")).sendKeys("hello");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("world");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys("hw r u");
		
	}
}
