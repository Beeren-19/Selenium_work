package JSE_SSH;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollpage_specificelement_click {
     public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(2000);
	     JavascriptExecutor js=new FirefoxDriver();
	     WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
	     Point loc = ele.getLocation();
	     System.out.println(loc);
	     int x = loc.getX();
	     int y = loc.getY();
	     js.executeScript("window.scrollBy("+x+","+y+")");
	     Thread.sleep(2000);
	     ele.click();
	}
}
