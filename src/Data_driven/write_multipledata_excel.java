package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class write_multipledata_excel {
      public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
    	  FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
    	  Workbook wb = WorkbookFactory.create(fis);
    	  Sheet sh = wb.getSheet("Sheet1");
    	  
    	  System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
    	  WebDriver driver=new FirefoxDriver();
    	  driver.get("https://www.filpkart.com");
    	  Thread.sleep(2000);
    	  List<WebElement> links = driver.findElements(By.xpath("//a"));
    	  for(int i=0;i<links.size();i++)
    	  {
    		  Row r = sh.createRow(i);
    		  Cell c = r.createCell(0);
    		  c.setCellValue(links.get(i).getAttribute("href"));
    	  }
    	  FileOutputStream fout=new FileOutputStream("./excel/excel.xlsx");
    	  wb.write(fout);

	}
}
