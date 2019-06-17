package com.seleniumPractice2;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		//String filePath = System.getProperty("user.dir")+"\\src\\TestData\\ExcelData.xlsx";
			
		File src = new File("./TestData/ExcelData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		//For loading excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//For loading specific sheet within workbook
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue(); 
		
		System.out.println("Data from excel is :"+data0);
		
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue(); 
		
		System.out.println("Data from excel is :"+data1);
		
		wb.close();
		
		
		
		
	}

}
