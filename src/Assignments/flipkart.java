package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver D1=new FirefoxDriver();
		D1.get("https://www.flipkart.com/");
		D1.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9164991755");
		D1.findElement(By.xpath("//input[@type='password']")).sendKeys("Beeren@1901");
		D1.findElement(By.xpath("(//span[.='Login'])[3]")).click();
		Thread.sleep(3000);
		D1.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung mobiles");
		D1.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
	}
}
