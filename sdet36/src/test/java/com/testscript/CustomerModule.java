package com.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	

	
	@Test
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}


	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	
}
	@Test
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	
}
}