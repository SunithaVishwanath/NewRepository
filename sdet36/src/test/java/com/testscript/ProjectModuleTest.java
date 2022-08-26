package com.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModuleTest {
	
	@Test
	public void CreateProject() {
		Reporter.log("CreateProject",true);
		String browser=System.getProperty("BROWSER");
		String url=System.getProperty("URL");	
		System.out.println("key="+browser);
	}

	@Test
	public void ModifyProject() {
		Reporter.log("ModifyProject",true);
	}
	
	@Test
	public void DeleteProject() {
		Reporter.log("DeleteProject",true);
	
}
}
