package paramerization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Atest {
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
		
	String readData = WorkbookFactory.create(path).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		
	System.out.println(readData);
		

		
	}

}
 