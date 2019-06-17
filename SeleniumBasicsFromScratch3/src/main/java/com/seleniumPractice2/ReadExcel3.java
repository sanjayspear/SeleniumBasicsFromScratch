package com.seleniumPractice2;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {

	public static void main(String[] args) throws Exception {
		//String filePath = System.getProperty("user.dir")+"\\src\\TestData\\ExcelData.xlsx";
			
		File src = new File("./TestData/AddressData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		//For loading excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//For loading specific sheet within workbook
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		//It gives the number of rows in the sheet
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println("total rows is "+(rowCount+1));
		
		//It gives number of cells in the specific row
		int cellCount = sheet1.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("total no. of cells "+cellCount);
		
		for(int i=0; i<=rowCount; i++) {
			
			for(int j=0; j<cellCount; j++) {
				String data1 = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Data from row no "+i+" & cell no "+j+" "+data1);
			}
			
		}
		
		wb.close();
		
		
		
		
	}

}
