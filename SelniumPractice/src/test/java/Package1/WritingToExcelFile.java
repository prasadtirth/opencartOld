package Package1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\testData1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data1");
		
	/*	for(int r=0;r<3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<3;c++)
			{
			   currentrow.createCell(c).setCellValue("ExcelFile");	
			}
		}     */
		
		Scanner sc = new Scanner(System.in);
		
		for(int r=0;r<3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			
			for(int c=0;c<3;c++)
			{
			   System.out.println("Enter The Value:");
			   currentrow.createCell(c).setCellValue(sc.next());	
			}
		}   
		 System.out.println("Done!!");
		
		workbook.write(file);
		
		workbook.close();
		file.close();

	}

}
