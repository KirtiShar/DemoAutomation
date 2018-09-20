package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws Exception
	{

		File f=new File("C:\\Users\\anand.mohan.patel\\workspace\\Automation\\src\\readAndWrite\\DataSheet.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet("sheet1");
		Row r=st.getRow(4);
		Cell c=r.getCell(0);
		c.setCellValue("Test Automation");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);

	}

}
