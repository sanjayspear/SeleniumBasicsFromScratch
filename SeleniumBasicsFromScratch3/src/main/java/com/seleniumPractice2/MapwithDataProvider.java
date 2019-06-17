package com.seleniumPractice2;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MapwithDataProvider {
    
	
	@org.testng.annotations.Test(dataProvider="testdata1")
	public void Test(Map mapdata) {
		 
		System.out.println("--------------Test Started-------------");
		System.out.println(mapdata.get("UserName"));
		System.out.println(mapdata.get("Password"));
		System.out.println(mapdata.get("DoB"));
		System.out.println("--------------Test Ended-------------");
	}
	
	@DataProvider(name="testdata1")
	public Object[][] dataproviderMethod() throws Exception {
		
		String filepath = "./TestData/TestData.xlsx";
		
		File file = new File(filepath);
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		wb.close();
		int rowcount = sheet1.getLastRowNum();
		int colcount = sheet1.getRow(0).getLastCellNum();
		
		//Here our aim is to read the data from excel sheet into the Map then transfer that map
		//data into the object array and return that object array by using this data provider method
		//to the Test() method.
		Object[][] obj = new Object[rowcount][1];
		
		//Define Map
		
		for(int i=0; i<rowcount; i++) {
			Map<Object , Object> datamap = new HashMap<Object, Object>();
			for(int j=0; j<colcount; j++) {
				//read cell data and store in map
					datamap.put(sheet1.getRow(0).getCell(j).toString(), sheet1.getRow(i+1).getCell(j));
			}
			obj[i][0] = datamap;
		}
		
		return obj;
		
		
	}
}
