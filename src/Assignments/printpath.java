package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printpath {
         public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			
			List<WebElement> img = driver.findElements(By.xpath("//img"));
			int count = img.size();
			System.out.println(count);
			for(WebElement we:img)
			{
				String b = we.getAttribute("src");
				System.out.println(b);
				
			}
			driver.close();
		}
}
