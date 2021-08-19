package testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
  @Test(enabled=false)
  public void test1()
  {
	  Reporter.log("1", true);
  }
  @Test(invocationCount=3,priority=2)
  public void test2()
  {
	  Reporter.log("2", true);
  }
}
