package Data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_multipledata_excel {
     public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++)
		{
			Row r = sh.getRow(i);
			
	   for(int j=0;j<r.getLastCellNum();j++)
	   {
		   System.out.print(r.getCell(j).toString()+" ");
	   }
	   System.out.println();
		}
	}
}
