package demoAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFile
{
	public static void main(String[] args) throws IOException 
	{
		    File file = new File("C:\\Users\\anand.mohan.patel\\workspace1\\automationTest\\src\\demoAutomation\\test.txt"); // For example, foo.txt
		    BufferedReader br = null;
			FileReader fr = null;
			int lineCount=0;
			int wordCount=0;
			String sCurrentLine;
			String content = "";
			
			try {

				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				while ((sCurrentLine = br.readLine()) != null) 
				{
					System.out.println(sCurrentLine);
					lineCount++;
					content=content+sCurrentLine;
				}
                System.out.println("line count is:"+lineCount);
				}
			catch (IOException e) 
			{

				e.printStackTrace();
			} 
			
		String[] word=content.split(" ");
		for(String w:word)
		{
			if(w.equalsIgnoreCase("bangalore"))
					{
				wordCount++;
					}
			
		}
		System.out.println(wordCount);

		}
}
