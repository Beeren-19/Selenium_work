package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload_popup {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/HTML/file%20upload.html");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='upload file']"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\Dell\\Desktop\\GoToWebinar 014.png");
	}
}
