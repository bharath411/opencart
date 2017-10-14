package com.slokam.opencart.automation.commons.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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
			
			String value = cell.getStringCellValue();
			System.out.println(value);
			
			cell = row.getCell(2);
			value = cell.getStringCellValue();
			System.out.println(value);
			
			
			
			row = sheet.getRow(3);
			
			cell = row.getCell(1);
			value = cell.getStringCellValue();
			System.out.println(value);
			
			cell = row.getCell(2);
			value = cell.getStringCellValue();
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ExcelHandler().test1();
	}
}
