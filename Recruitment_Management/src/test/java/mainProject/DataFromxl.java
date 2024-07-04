package mainProject;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataFromxl 
{
	static String path = "E:\\html\\OrangeHRM.xlsx";
	static String value;

	public static String ddt(String sheet,int row,int cell) {
		
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet(sheet);
			value= sh.getRow(row).getCell(cell).toString();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;

}
}
