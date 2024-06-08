package frame2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Breading_data_from_excel {

	public static void main(String[] args) throws IOException {
		
		//approch1
	//	File f=new File("C:\\Users\\BHAGYASHRI\\eclipse-workspace\\Autmoationproj\\data_excel\\doc1.xlsx");
		
	// fis=new FileInputStream(f);
		
		//approch2
		FileInputStream fis1=new FileInputStream("C:\\Users\\BHAGYASHRI\\eclipse-workspace\\Autmoationproj\\data_excel\\doc1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis1); 
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
	 int colms = sheet.getRow(0).getPhysicalNumberOfCells();
	 
	

	 System.out.println(rows);
	 System.out.println(colms);
	 
	 System.out.println("-------------------------------------------");
	 
/*	int row1 = sheet.getLastRowNum();
	  short colm1 = sheet.getRow(0).getLastCellNum();
	  int colm2=colm1;
	 
	  System.out.println(row1);
		 System.out.println(colm2); */
		 
		 
	 for(int i=0; i<=rows; i++)
	 {
		 XSSFRow row = sheet.getRow(i);
		 
		 for(int j=0; j<colms; j++)
		 {
			 XSSFCell cell = row.getCell(j);
			 String rowcellvalue = cell.toString();
			 System.out.print(rowcellvalue + "   ");
		 }
		 System.out.println("    ");
	 }
	 
	 

	}

}
