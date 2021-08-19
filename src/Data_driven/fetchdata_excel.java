package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdata_excel {
      public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException,
      IOException {
		
    	  FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
    	  
    	  Workbook wb=WorkbookFactory.create(fis);
    	  
    	  Sheet sh=wb.getSheet("Sheet1");
    	  
    	  Row r=sh.getRow(3);
    	  
    	  Cell  c=r.getCell(0);
    	  
    	  String value=c.toString();
    	  
    	  System.out.println(value);
    	  
	}
}
