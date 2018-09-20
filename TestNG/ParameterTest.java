package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest 
{
	@Parameters({"emp_name","emp_id","location","skill"})
	@Test
	public void test(String emp_name, String emp_id,String location,String skill)
	{
		System.out.println("name is "+emp_name);
		System.out.println("id is "+emp_id);
		System.out.println("location is "+location);
		System.out.println("skill is "+skill);
	}

}
