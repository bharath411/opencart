package com.slokam.opencart.automation.commons.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelHandler {

	
	public void test1() {
		
		File file = new File("D:\\Data.xls");
		try {
			FileInputStream fis  = new FileInputStream(file);
			
			// Getting workbook
			
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet  = workbook.getSheet("Sheet1");
			
			HSSFRow row = sheet.getRow(2);
			HSSFCell cell = row.getCell(1);
			System.out.println(getValue(cell));
			cell = row.getCell(0);
			System.out.println(getValue(cell));
			
			cell = row.getCell(2);
			System.out.println(getValue(cell));
			
			row = sheet.getRow(3);
			
			cell = row.getCell(1);
			System.out.println(getValue(cell));
			
			cell = row.getCell(2);
			System.out.println(getValue(cell));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getValue(HSSFCell cell) {
		String value ="";
		switch (cell.getCellTypeEnum()) {
		case BLANK:
			value="";
			break;
		case BOOLEAN:
			boolean b = cell.getBooleanCellValue();
			value = String.valueOf(b);
			break;
		case ERROR:
			
			break;
		case FORMULA:
			value = cell.getCellFormula();
			break;
		case NUMERIC:
			int d= (int)cell.getNumericCellValue();
			value = String.valueOf(d);
			break;
		case STRING:
				value = cell.getStringCellValue();
			break;
		default:
			value="";
			break;
		}
		
		return value;
	}
		
		
	public static void main(String[] args) {
		new ExcelHandler().test1();
	}
}
