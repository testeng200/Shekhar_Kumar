package pomRepo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchTheDataFromExcelSheet {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/propertyData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String url = cell.getStringCellValue();
		System.out.println(url);
		
		String username = row.getCell(1).getStringCellValue();
		String password = row.getCell(2).toString();
		
		System.out.println(username);
		System.out.println(password);
		
		double num = row.getCell(3).getNumericCellValue();
		boolean bool = row.getCell(4).getBooleanCellValue();	
		
		System.out.println(num);
		System.out.println(bool);
		
	}

}
