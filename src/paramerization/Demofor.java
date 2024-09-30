package paramerization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Demofor {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream path = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\New XLSX Worksheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(path).getSheet("Sheet1");

		for (int i = 0; i <= 4; i++) 
		{
			for(int j = 1; j<= 3; j++)
			{

			String data = sh.getRow(i).getCell(j).getStringCellValue();

			System.out.println(data);
			}
		}
	}



}
