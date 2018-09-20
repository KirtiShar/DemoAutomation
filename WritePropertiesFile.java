package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) 
	{
        try
        {
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\testdata.properties.txt");
		FileInputStream fis=new FileInputStream(f);
		Properties pro=new Properties();
		pro.load(fis);
		pro.setProperty("status", "single");
		FileOutputStream fos=new FileOutputStream(f);
		pro.store(fos, "added status");
		System.out.println("Address Added");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        GenericWriteProp.writeData("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\testdata.properties.txt",
        		"Address", "Sasaram", "Addred Added by Anand");
        System.out.println("Address Added by generic");

	}

}
