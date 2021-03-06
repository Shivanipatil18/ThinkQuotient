package pkg;

import java.io.File;


import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXReaderFile {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\empdata.xlsx"); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			//wb.getSheet("Sheet1");
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			
			while (itr.hasNext()) {
				Row row = itr.next();

				//row.cell
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {
					case STRING:
						
						// field that represents string cell type
						System.out.print(cell.getStringCellValue() + " | | ");
						break;
					case NUMERIC: // field that represents number cell type
						System.out.print(cell.getNumericCellValue() + " | | ");
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + " | | ");
					default:
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
