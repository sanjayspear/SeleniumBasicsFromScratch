package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;

	public static ArrayList<Object[]> getTestDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("./TestData/HalfEbayTestData2.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			
			String Firstname = reader.getCellData("RegTestData", "Firstname", rowNum);
			String Lastname = reader.getCellData("RegTestData", "Lastname", rowNum);
			String Email = reader.getCellData("RegTestData", "Email", rowNum);
			String Password = reader.getCellData("RegTestData", "Password", rowNum);
			
			Object ob[] = {Firstname, Lastname, Email, Password};
			myData.add(ob);
		}
		
		return myData;
		
	}
	
}
