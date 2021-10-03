package excelhandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\MyExcel.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook();
Sheet sheet = workbook.createSheet();
Row row = sheet.createRow(0);
Cell cell = row.createCell(0);
cell.setCellValue("Hi this is from poi");
workbook.write(fo);
workbook.close();
	}

}
