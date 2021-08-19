package qps;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver D=new ChromeDriver();
	   org.openqa.selenium.Point p=new org.openqa.selenium.Point(300,200);
	   D.manage().window().setPosition(p);
	}
}
