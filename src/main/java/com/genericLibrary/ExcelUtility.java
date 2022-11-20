package com.genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getDataFromExcel(String sheetname,int row,int cell ) throws Throwable
{
	FileInputStream fis=new FileInputStream
			("C:\\Users\\SONYPC\\Desktop\\MyExcel.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetname);
	Row ro=sh.getRow(row);
	String data=ro.getCell(cell).getStringCellValue();
	book.close();
	return data;
	
}
}
