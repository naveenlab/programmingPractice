package com.datadriventest;

import com.excel.utility.Xls_Reader;

public class ExcelUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader("C:\\Users\\navee\\AutomationFramework\\ERS_ARCHER\\src\\com\\testdata\\EbayTestData.xlsx");
		int rowCount = reader.getRowCount("registraion");
		reader.getColumnCount("registraion");
		
		if(!reader.isSheetExist("homePage")) {
			reader.addSheet("homePage");	
		}
		
		
	}

}
