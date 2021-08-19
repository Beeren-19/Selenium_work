package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
          
	//declaration
	@FindBy(name="email")
	private WebElement untbox;
	@FindBy(name="pass")
	private WebElement pwdtbox;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//initialization
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
}
