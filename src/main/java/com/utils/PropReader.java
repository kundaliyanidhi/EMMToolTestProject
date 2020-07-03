package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropReader {
	
	Properties pr;
	//Constructor for the PropReader class.
	public PropReader(String filepath) {
		pr = new Properties();
		try {
			pr.load(new FileInputStream(new File(filepath)));
		}catch (Exception e) {}
	}
	
	//Method to fetch values from the config.properties file.
	public String getValue(String Key) {
		return pr.getProperty(Key);
	}

}
