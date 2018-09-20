package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestClass
{
	
	@DataProvider(name="testdata")
	public Object[][] testdata()
	{
		Object[][] obj=new Object[4][3];
		obj[0][0]=1;
		obj[0][1]="anand";
		obj[0][2]="bihar";
		obj[1][0]=2;
		obj[1][1]="Kirti";
		obj[1][2]="UP";
		obj[2][0]=3;
		obj[2][1]="jazz";
		obj[2][2]="Telangana";
		obj[3][0]=4;
		obj[3][1]="Vandana";
		obj[3][2]="Karnataka";
		return obj;	
	}
	@Test(dataProvider="testdata")
	public void test(int roll,String name,String state )
	{
		System.out.println("roll number is "+roll);
		System.out.println("name is "+name);
		System.out.println("State is "+state);
	}

}
