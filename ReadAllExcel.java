package readAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllExcel
{
	
	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\DataSheet.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet("sheet1");
		
		for(int i=0;i<=st.getLastRowNum();i++)
		{
			
			for (int j=0;j<=1;j++)
			{
				Row r=st.getRow(i);
				String s1=r.getCell(j).toString();
				System.out.print(s1+"      ");
				
			}
			System.out.println();
		}	
	}
	
	

}
