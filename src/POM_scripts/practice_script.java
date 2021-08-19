package POM_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.practice;

public class practice_script {

	@Test
	public void script()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		practice p=new practice(driver);
		p.setmobnum("9164991755");
		p.setpwd("Beeren@1901");
		p.clicklgn();
				
	}
}
