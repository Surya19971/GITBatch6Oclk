package org.stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	 public static void generateReport(String jsonpath) {
		
    File f = new File("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Reports\\jvm");
	Configuration c=new Configuration(f, "E Commerce");
	c.addClassifications("Platform", "windows");
	c.addClassifications("Browser", "GoogleChrome");
	c.addClassifications("Tester", "Surya");
	List<String> l = new ArrayList<String>();
	l.add(jsonpath);
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();

}
}
