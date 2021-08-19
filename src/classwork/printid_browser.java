package classwork;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printid_browser {
    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com");
		Set<String> ele = driver.getWindowHandles();
		int count = ele.size();
		System.out.println(count);
		for(String wh:ele)
		{
			System.out.println(wh);
		}
	}
}
