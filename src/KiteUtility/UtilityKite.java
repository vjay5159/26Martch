package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class UtilityKite {
             WebDriver driver;
/*	public static String ReadfromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File Myfile=new File("C:\\Users\\Ajay Bharat Kokate\\Desktop\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		 String value = Mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return value;	
	}*/
	public static String getDatafromPropertiesFile(String key) throws IOException
	{
		Properties obj = new Properties();
		FileInputStream Myfile = new FileInputStream("C:\\Users\\Ajay Bharat Kokate\\eclipse-workspace\\TRAINGNG\\kite.peroperties");
		obj.load(Myfile);
		String value = obj.getProperty(key);
		return value;			
	}
	public void ScreenShot(String name) throws IOException
 {
    	String rs = RandomString.make(3);
    	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dist= new File("F:\\screenshot\\test"+name+"_"+rs+".png");
     	FileHandler.copy(source, dist);
		Reporter.log("ScreenShot successful",true);
 }
}
