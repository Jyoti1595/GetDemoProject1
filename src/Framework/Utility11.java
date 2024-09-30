package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import config.Configuration;

public class Utility11 {
	

	
	public String readExcelData(int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream ff = new FileInputStream(Configuration.excelPath);
		
		//Read excel sheet data
		
		Sheet sheet = WorkbookFactory.create(ff).getSheet("Sheet3");
		
		//read value and store it into variable
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
	
		
		return value;
		
	
	}

	

}
