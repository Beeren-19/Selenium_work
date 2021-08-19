package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_data_excel {
      public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException,
      IOException {
		
    	  FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
    	  Workbook wb = WorkbookFactory.create(fis);
    	  Sheet sh = wb.getSheet("Sheet1");
    	  Row r = sh.createRow(4);
    	  Cell c = r.createCell(1);
    	  c.setCellValue("selenium");
    	  FileOutputStream fout=new FileOutputStream("./excel/excel.xlsx");
    	  wb.write(fout);
    	  
	}
}
