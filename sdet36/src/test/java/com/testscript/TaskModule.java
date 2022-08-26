package com.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void CreateTask() {
		Reporter.log("CreateTask",true);
	}


	@Test
	public void ModifyTask() {
		Reporter.log("ModifyTask",true);
	
	}
	@Test
	public void DeleteTask() {
		Reporter.log("DeleteTask",true);
	
}

}
