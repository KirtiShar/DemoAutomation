package readAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\DataSheet.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet("sheet1");
		Row r=st.getRow(0);
		String s=r.getCell(0).toString();
		System.out.println(s);
		
	}

}
