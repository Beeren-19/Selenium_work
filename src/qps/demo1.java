package qps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {
       public static void main(String[] args) {
		String key="webdriver.gecko.driver"; //indicates specify type of browser
		
		String value="./Softwares/geckodriver.exe"; //path of driver executable file
		
		System.setProperty(key, value);
		
		FirefoxDriver driver=new FirefoxDriver();
		
	}
}
