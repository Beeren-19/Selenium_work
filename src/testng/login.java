package testng;

import org.apache.bcel.generic.ConstantPushInstruction;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login extends Generic_test {
       @Test
       public void validlogin() throws InterruptedException
       {
    	   driver.findElement(By.id("email")).sendKeys("9164991755");
    	   driver.findElement(By.id("pass")).sendKeys("Beeren@1901");
    	   driver.findElement(By.name("login")).click(); 
    	   Thread.sleep(3000);
    	   String title = driver.getTitle();
    	   System.out.println(title);
    	  SoftAssert sa=new SoftAssert();
    	  sa.assertEquals(title, "hello");
    	   System.out.println("1");
    	   sa.assertAll();
    	   
       }
}
