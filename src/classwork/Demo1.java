package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
   public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  List<WebElement> links = driver.findElements(By.xpath("//a"));
	  int count = links.size();  //count the links
	  System.out.println(count);
	  
	  //to get the text of the links
	  
	  for(int i=count-1;i>=0;i--)
	  {
		  WebElement we = links.get(i);
		  String text = we.getText();
		  System.out.println(text);
	  }
	  driver.close();
}
}
