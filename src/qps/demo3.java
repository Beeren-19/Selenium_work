package qps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {
	public static void main(String[] args) {
		
	String key="webdriver.chrome.driver";
	
	String value="./Softwares/chromedriver.exe";
	
	System.setProperty(key, value);
	
	ChromeDriver driver=new ChromeDriver();
	

	String key1="webdriver.gecko.driver";
	
	String value2="./Softwares/geckodriver.exe";
	
	System.setProperty(key1, value2);
	
	FirefoxDriver d1=new FirefoxDriver();
}
}


