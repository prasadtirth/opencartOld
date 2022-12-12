package Package1;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RedingExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int total_rows=sheet.getLastRowNum();
		int total_cols=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number Of Rows:"+total_rows);
	    System.out.println("Number Of Columns:"+total_cols);
	    
	    for(int r=0; r<total_rows; r++)
	    {
	    	XSSFRow currentrow=sheet.getRow(r);
	    	
	    	for(int c=0; c<total_cols; c++)
	    	{
	    		XSSFCell cell=currentrow.getCell(c);
	    		System.out.print(cell.toString()+"    ");
	    	}
	    	System.out.println();
	    }
          workbook.close();
          file.close();
	    
	}

}
