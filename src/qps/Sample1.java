package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
      public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='മലയാളം']"));
		String tooltip = ele.getAttribute("title");
		System.out.println(tooltip);
	}
}
