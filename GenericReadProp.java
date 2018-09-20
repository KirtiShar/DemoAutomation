package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GenericReadProp 
{
	
	public static String generic(String filepath,String key) throws Exception
	{
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		Properties pro=new Properties();
		pro.load(fis);
		String s=pro.getProperty(key).toString();
		return s;
		
	}

}
