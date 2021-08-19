package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependency {
      @Test
      public void compose()
      {
    	  Reporter.log("compose", true);
      }
      @Test(dependsOnMethods="sentitems")
      public void trash()
      {
    	  Reporter.log("trash", true);
      }
      @Test(dependsOnMethods="compose")
      public void sentitems()
      {
    	  Reporter.log("sentitems", true);
      }
}
