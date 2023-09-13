package com.maps;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesMap {
	public static void main(String[] args) throws Exception {
		Properties p= new Properties();
		
		FileInputStream f= new FileInputStream("myproperties2.properties");
		p.load(f);
		System.out.println(p);
         String d=p.getProperty("user");
		System.out.println(d);
	}

}
