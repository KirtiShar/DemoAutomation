package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\testdata.properties.txt");
		FileInputStream fis=new FileInputStream(f);
		Properties pro=new Properties();
		pro.load(fis);
		String s=pro.getProperty("name").toString();
		System.out.println(s);
		String s1=pro.getProperty("sex").toString();
		System.out.println(s1);
		System.out.println("@@@@@@@Generic function ofRead@@@@@@@@");
		String s2=GenericReadProp.generic("C:\\Users\\anand.mohan.patel"
				+ "\\workspace\\Automation\\src\\readAndWrite\\testdata.properties.txt",
				"name");
		System.out.println(s2);
	
	}

}

