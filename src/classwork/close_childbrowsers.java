package classwork;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class close_childbrowsers {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.naukri.com");
	String parent_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	   int count = allwh.size();
	   System.out.println(count);
	   allwh.remove(parent_id);
	   count=allwh.size();
	   System.out.println(count);
	   for(String wh:allwh)
	   {
		   driver.switchTo().window(wh);
		   String title = driver.getTitle();
		   System.out.println(title);
		   Thread.sleep(2000);
		   driver.close();
		   
	   }
}
}
