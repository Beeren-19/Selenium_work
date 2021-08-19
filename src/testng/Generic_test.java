package testng;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Generic_test {
   public WebDriver driver;
   @BeforeMethod
   public void openapp()
   {
	   System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	   driver=new FirefoxDriver();
	   driver.get("https://www.facebook.com/");	   
   }
   @AfterMethod
   public void closeapp() throws InterruptedException
   {
	   Thread.sleep(2000);
          driver.close();
}
}
