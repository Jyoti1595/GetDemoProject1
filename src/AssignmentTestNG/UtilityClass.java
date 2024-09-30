package AssignmentTestNG;
	

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import config.Configuration;

public class UtilityClass {
public String readExcelData(int row, int col) throws EncryptedDocumentException,IOException	{
		
		
		FileInputStream ff=new FileInputStream(Configuration.excelPath);
		
		Sheet sht = WorkbookFactory.create(ff).getSheet("Sheet3");
		
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;
}

}
