package JSE_SSH;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleardata_disabled {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Dell/Desktop/HTML/disabled.html");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('t1').value=''");
}
}
