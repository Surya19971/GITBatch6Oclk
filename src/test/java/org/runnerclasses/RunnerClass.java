package org.runnerclasses;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinitions.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinitions", monochrome=true, strict=true, dryRun=false, plugin= {"pretty",
	"html:C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Reports\\html",
	"json:C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Reports\\json\\real.json",
	"junit:C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Reports\\junit\\Real.xml",
	"rerun:C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Rerun\\failed.txt"
})
public class RunnerClass {
	
	@AfterClass
	public static void report() {
		JVMReport.generateReport("C:\\Users\\welcome\\Downloads\\photon\\eclipse\\RealTime\\Reports\\json\\real.json");
	}

}
