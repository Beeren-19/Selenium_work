package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {
      public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@class='_sv4']"));
		Point locn = ele.getLocation();
		System.out.println(locn);
		int x = locn.getX();
		System.out.println(x);
		int y = locn.getY();
		System.out.println(y);
	}
}
