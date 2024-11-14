package com.dataset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {

	public static void main(String[] args) throws IOException {

		File f = new File(
				
				
"C:\\Users\\pdine\\eclipse-workspace\\MMSADB\\Dataset\\Data_Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			int cellSize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellSize; j++) {
				Cell cell = row.getCell(j);
				CellType typeofcell = cell.getCellType();
				if (typeofcell.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (typeofcell.equals(CellType.NUMERIC)) {
					double val = cell.getNumericCellValue();
					System.out.println(val);
				}
			}
		}
	}

}
