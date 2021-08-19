package POM_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.loginpage;

public class loginscript {
      @Test
      public void hello()
      {
    	  System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
    	  WebDriver driver=new FirefoxDriver();
    	  driver.get("https://www.facebook.com/");
    	  loginpage lp=new loginpage(driver);
    	  lp.setusername("9164991755");
    	  lp.setpassword("Beeren@1901");
    	  lp.clicklogin();
      }
}
