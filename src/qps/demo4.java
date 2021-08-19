package qps;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
   public static void main(String[] args) throws InterruptedException {
	
	   String key="webdriver.chrome.driver";
   	
   	String value="./Softwares/chromedriver.exe";
   	
   	System.setProperty(key, value);
   	
   	ChromeDriver driver=new ChromeDriver();
   	
   	Thread.sleep(3000);
   	
   	driver.close(); //to close the current tab/specific tab
   	
   	driver.quit(); //to close entire browser
}
}
