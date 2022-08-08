package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Reading {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Vike\\Desktop\\DATADRIVEN.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(0);
	

		Cell cell = row.getCell(0);

		CellType celltype = cell.getCellType();

		if (celltype.equals(celltype.STRING)) {
			String stringcellvalue = cell.getStringCellValue();
			System.out.println("string:" + stringcellvalue);
		}

		else if (celltype.equals(celltype.NUMERIC)) {
			double numberic = cell.getNumericCellValue();
			System.err.println("nuumber:" + numberic);
		}
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		System.out.println("row_size:" + rowsize);

		for (int i = 0; i < rowsize; i++) {

			Row row2 = sheetAt.getRow(i);

			int cellcount = row2.getPhysicalNumberOfCells();

			for (int j = 0; j < cellcount; j++) {
				Cell cell2 = row2.getCell(j);
				String stringcellValue = cell2.getStringCellValue();
				System.out.println(stringcellValue);
			}
		}

	}
}