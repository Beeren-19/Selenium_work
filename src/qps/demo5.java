package qps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo5 {
     public static void main(String[] args) {
		
    	 String key="webdriver.gecko.driver";
    	 String value="./Softwares/geckodriver.exe";
    	 
    	 System.setProperty(key, value);
    	 
    	 WebDriver driver=new FirefoxDriver();
    	 
    	
    	 
	}
}
