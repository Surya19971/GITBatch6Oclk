package org.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.runnerclasses.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks1 extends BaseClass{
	
	@Before
	public  void bef() {
		System.out.println("start");

	}
	
	@After
	public void aft(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot) driver;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");
			
		}
		
		exit();

	}

}
