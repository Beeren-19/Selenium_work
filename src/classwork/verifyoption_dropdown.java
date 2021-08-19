package classwork;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyoption_dropdown {
     public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/HTML/dropdown.html");
		WebElement ele = driver.findElement(By.id("empire"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement we:options)
		{
			String text = we.getText();
			l.add(text);
		}
		if(l.contains("veg biryani"))
		{
			System.out.println("option present");
		}
		else
		{
			System.out.println("option not present");
		}
	}
}
