import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String filepath = "C:\\Users\\anany\\Downloads\\Book.xlsx";
		
		File excelfile = new File(filepath);
		
		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		System.out.println("number of columns" +rows);

		
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of columns" +col);
		
		
		for (int r=0;r<rows;r++) {
			
			XSSFRow row =sheet.getRow(r);
			
			for (int c=0;c<rows;c++) {
				
				XSSFCell cell = row.getCell(c);
				
				CellType cellType = cell.getCellType();
				
				
				switch(cellType) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;

					
				}
				
				
				
				
				
				
				
			}
			}
		workbook.close();
				
		}
		

	}


