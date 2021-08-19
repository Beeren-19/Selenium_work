package classwork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class opentab_switchcontrol_newtab {
   public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	
	WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act=new Actions(driver);
	Robot r=new Robot();
			act.contextClick(ele).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l=new ArrayList<String>(allwh);
	String wh = l.get(1);
	driver.switchTo().window(wh);
	
	
}
}
