package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden_popup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.cleartrip.com/");
	
	driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[.='16'])[2]")).click();
}
}
