package classwork;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switch_onetab_anothertab {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		ArrayList<String> l=new ArrayList<String>(allwh);
		int count1 = l.size();
		System.out.println(count1);
		String wh = l.get(2);
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		driver.close();
		
	}
}
