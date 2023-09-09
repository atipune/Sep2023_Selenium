package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelPath=System.getProperty("user.dir")+"\\TestData\\Test.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet3");
		Row r = s.getRow(8);
		Cell c = r.getCell(1);	
//		String value = wb.getSheet("Sheet3").getRow(8).getCell(3).getStringCellValue();
//		CellType type = c.getCellType();
//		System.out.println(type);
//		String value = c.getStringCellValue();
//		System.out.println(value);
			for(int i=0; i<=9; i++) //All cells type
			{
				Cell cell = wb.getSheet("Sheet3").getRow(8).getCell(i);
				CellType cellType = cell.getCellType();
				//System.out.println(cellType);
				try {
					switch (cellType) 
					{
						case BOOLEAN:
							System.out.print(cell.getBooleanCellValue());
							break;
						case STRING:
							System.out.print(cell.getStringCellValue());
							break;
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								System.out.print(cell.getDateCellValue());
							} 
							else {
								System.out.print(cell.getNumericCellValue());
							}
							break;
						case FORMULA:
							System.out.print(cell.getCellFormula());
							break;
						default:
							System.out.print("");
					}
				}
				catch (NullPointerException e)
				{
					System.out.println("null");
				}
				
			}

	}
}
