package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test (dataProvider = "distance")
	public void executeScript(String From,String To) {
		System.out.println(From+"To"+To);
	}
	
	@DataProvider
	public Object[][] distance(){
		Object[][] objArr=new Object[2][2];
		objArr[0][0]="Bangalore";
		objArr[0][1]="Mysore";
		objArr[1][0]="Chennai";
		objArr[1][1]="Hubli";
		return objArr;
		
	}

}
