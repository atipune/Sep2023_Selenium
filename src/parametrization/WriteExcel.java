package parametrization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String s= "Hi";
		
		String excelPath=System.getProperty("user.dir")+"\\TestData\\Test - Copy.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("ati").createRow(10).createCell(4).setCellValue(s);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		System.out.println("Program ends here");
	}
}
