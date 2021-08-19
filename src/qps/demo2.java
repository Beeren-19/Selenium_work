package qps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo2 {
    public static void main(String[] args) {
		
    	String key="webdriver.chrome.driver";
    	
    	String value="./Softwares/chromedriver.exe";
    	
    	System.setProperty(key, value);
    	
    	ChromeDriver driver=new ChromeDriver();
    	
	}
}
