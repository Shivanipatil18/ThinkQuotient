package pkg;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLSXWriteFile {
	
	 public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{
		//filepath - filename - sheetname - datatowrite;;
		       //Create an object of File class to open xlsx file
		        File file =    new File(filePath+"\\"+fileName);
		      //Create an object of FileInputStream class to read excel file
		        FileInputStream inputStream = new FileInputStream(file);
		        //Workbook - Sheet1 - Row - Cell
		        Workbook TheWorkbook = null;
		        String fileExtensionName = fileName.substring(fileName.indexOf("."));
		      
		        if(fileExtensionName.equals(".xlsx")) {
		        TheWorkbook = new XSSFWorkbook(inputStream);
		        }
		      
		        else if(fileExtensionName.equals(".xls")){

		            //If it is xls file then create object of XSSFWorkbook class

		            TheWorkbook = new HSSFWorkbook(inputStream);

		        }    

		    Sheet sheet = TheWorkbook.getSheet(sheetName);

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		    System.out.println("Last row num is:"+sheet.getLastRowNum());
		    System.out.println("First row num is:"+sheet.getFirstRowNum());
		    
		    //sysout - lastrownum - firstrownum
		    
		    //Get the first row from the sheet


		    Row row = sheet.getRow(0);
		    
		    //Create a new row and append it at last of sheet

		    Row newRow = sheet.createRow(rowCount+1);
		   // sheet.
		    //Create a loop over the cell of newly created Row
		    
		    for(int j = 0; j < row.getLastCellNum(); j++){

		        //Fill data in row

		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(dataToWrite[j]);

		    }
		// Open file - Input stream - workbook(inputstream) - sheet - Row - Add the data 
		    //Close input stream

		    inputStream.close();

		    //Create an object of FileOutputStream class to create write data in excel file

		    FileOutputStream outputStream = new FileOutputStream(file);

		    //write data in the excel file

		    TheWorkbook.write(outputStream);

		    //close output stream

		    outputStream.close();
			
		    }

		    public static void main(String...strings) throws IOException{

		        //Create an array with the data in the same order in which you expect to be filled in excel file
		        String[] valueToWrite = {"Morning: 1212pm","ThinkQ"};
		        //Create an object of current class
		        XLSXWriteFile objExcelFile = new XLSXWriteFile();
		        //Write the file using file name, sheet name and the data to be filled
		        objExcelFile.writeExcel(System.getProperty("user.dir")+"\\src\\morning","excelwrite.xlsx","Sheet1",valueToWrite);
		        //System.out.println(System.getProperty("user.dir"));
		        
		       System.out.println("User dir is:"+System.getProperty("user.dir"));
		        System.out.println("***Write successfull***");
		    }

}
