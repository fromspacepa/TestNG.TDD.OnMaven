package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil_InClass {

	public static void main(String[] args) throws IOException {

		String pathToExcelfile = ".\\src\\test\\resources\\inputData\\Data.xlsx";

		FileInputStream file = new FileInputStream(pathToExcelfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("info");

		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = row.getLastCellNum();
		
		for (int i = 0; i < rowCount ; i++) {
			for (int j = 0; j < colCount; j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		
		
		
	
		
	}
	
}
