package excelhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

public String readexcelfile(String input,String sheetname,int rownumber,int cellnumber) throws IOException {	
FileInputStream fi = new FileInputStream(input);
XSSFWorkbook workbook = new XSSFWorkbook(fi);
Sheet sheet = workbook.getSheet(sheetname);
Row r = sheet.getRow(rownumber);
Cell c = r.getCell(cellnumber);
String str = c.getStringCellValue();
//System.out.println(str);
workbook.close();
return str;
	}

}
