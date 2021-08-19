package classwork;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class printoptions_treeset_desc {
    public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver",  "./Softwares/geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("file:///C:/Users/Dell/Desktop/HTML/dropdown.html");
	  WebElement ele = driver.findElement(By.id("empire"));
	  Select s=new Select(ele);
	  List<WebElement> options = s.getOptions();
	  int count = options.size();
	  System.out.println(count);
	  TreeSet<String> l1=new TreeSet<String>(Collections.reverseOrder());
	  for(WebElement we:options)
	  {
		  String text = we.getText();
		  l1.add(text);
	  }
	  for(String t:l1)
	  {
		  System.out.println(t);
	  }
	}
}
