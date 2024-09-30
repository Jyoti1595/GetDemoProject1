package paramerization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiplevaluesdemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		for (int i = 1; i <= 4; i++) {

			FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
			
			String readData = WorkbookFactory.create(path).getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();

			System.out.println(readData);			
		

		}
	}

}
