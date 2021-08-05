package com.properties.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class setProperty {
	
	
	//get Properties
	public static void setPropertyData(String filePath, String key, String value, String comment) throws IOException {
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, comment);	
	}
	
	//set Properties
	
	public static String getProperty(String filePath, String key) throws IOException {
		
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			String str = p.getProperty(key).toString();
			return str;
					
	}
	
	

	
}
