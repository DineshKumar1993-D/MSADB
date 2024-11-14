package com.dataset;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {

	public static void main(String[] args) throws IOException {

		File f = new File(

				"C:\\Users\\pdine\\eclipse-workspace\\MMSADB\\Dataset\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

	//	wb.createSheet("LoginDetails").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("LoginDetails").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("LoginDetails").createRow(1).createCell(0).setCellValue("Java@!23");
		wb.getSheet("LoginDetails").getRow(1).createCell(1).setCellValue("49734987");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		System.out.println("Successfully Written");
	}

}
