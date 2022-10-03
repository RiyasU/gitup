package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readwrite {
	
	@Test
	
	public void T1() throws IOException
	{
		File f= new File("C:\\Users\\Riyas\\OneDrive\\Desktop\\Riyas demo maven.xlsx");
		FileInputStream fis= new FileInputStream(f);
		
		//convert excel into workbook
		XSSFWorkbook x= new XSSFWorkbook(fis);
		
		//reach the sheet
		XSSFSheet sheet= x.getSheetAt(0);
		
		//read num of row
		int row = sheet.getLastRowNum();
		System.out.println("Num of rows"+ row);
		
		//num of column : specific about the row index
		
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("num of column"+ column);
		
		//cell= >know the cell row index and column index
		XSSFCell data = sheet.getRow(4).getCell(1);
		System.out.println(data);
		
		
		
		
	}

}
