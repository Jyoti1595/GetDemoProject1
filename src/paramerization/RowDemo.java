
package paramerization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
		
		Sheet sht = WorkbookFactory.create(path).getSheet("Sheet1");

		for (int i = 0; i <= 4; i++) {

			String data = sht.getRow(i).getCell(1).getStringCellValue();

			System.out.println(data);
		}
	}

}
