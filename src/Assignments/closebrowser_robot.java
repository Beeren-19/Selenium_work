package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closebrowser_robot {
    public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
       driver.get("https://www.google.com/");
           Robot r=new Robot();
           r.keyPress(KeyEvent.VK_ALT);
           r.keyPress(KeyEvent.VK_SPACE);
           r.keyPress(KeyEvent.VK_C);
           r.keyRelease(KeyEvent.VK_ALT);
           r.keyRelease(KeyEvent.VK_SPACE);
           r.keyRelease(KeyEvent.VK_C);
    }
}
