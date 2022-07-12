package AngleOneUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility
{
/*	public static String readfromExcle(int row,int cell) throws EncryptedDocumentException, IOException
	{
	File Myfile = new File("C:\\Users\\Ajay Bharat Kokate\\Desktop\\Book1.xlsx");
	Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
	 String value = Mysheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	}	*/
	public static String getDatafromPropertiesFile(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream Myfile= new FileInputStream("C:\\Users\\Ajay Bharat Kokate\\eclipse-workspace\\TRAINGNG\\kite.peroperties");
		pro.load(Myfile);
		String value=pro.getProperty(key);
		return value;
	}

}
