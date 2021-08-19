package qps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {
    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='laptop-desktop-only']"));
		String text = ele.getText();
		System.out.println(text);
	}
}
