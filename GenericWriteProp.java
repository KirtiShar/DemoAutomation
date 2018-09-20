package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class GenericWriteProp
{
	public static void writeData(String filepath,String key,String value,String comment)
	{
		try
        {
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		Properties pro=new Properties();
		pro.load(fis);
		pro.setProperty(key, value);
		FileOutputStream fos=new FileOutputStream(f);
		pro.store(fos, comment);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
