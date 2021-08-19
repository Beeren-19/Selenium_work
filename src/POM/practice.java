package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice {
     
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobtbox;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement lgnbtn;
	
	public practice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setmobnum(String mob)
	{
		mobtbox.sendKeys(mob);
		
	}
	public void setpwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clicklgn()
	{
		lgnbtn.click();
	}
}
