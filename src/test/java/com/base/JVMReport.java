package com.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generatJVMReport(String json) {
		File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JVM Reports");

		Configuration con = new Configuration(loc, "Facebook");
		con.addClassifications("Browsername", "Chrome");
		con.addClassifications("Version", "83");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Sprint", "20");
		
		List<String> jsonFiles= new LinkedList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();
	}

}
