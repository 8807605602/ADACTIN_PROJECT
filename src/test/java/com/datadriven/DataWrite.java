package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Vike\\Desktop\\DATAWRITING.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook();

		Sheet createsheet = wb.createSheet("DATA");
		Row createRow = createsheet.createRow(0);
		Cell createcell = createRow.createCell(0);

		createcell.setCellValue("S.NO");
		wb.getSheet("DATA").createRow(1);
		wb.getSheet("DATA").createRow(2);
		wb.getSheet("DATA").createRow(3);

		wb.getSheet("DATA").getRow(0).createCell(1).setCellValue("NAME");
		wb.getSheet("DATA").getRow(0).createCell(2).setCellValue("QUALIFICATION");
		wb.getSheet("DATA").getRow(0).createCell(3).setCellValue("PASSED OUT");

		wb.getSheet("DATA").getRow(1).createCell(0).setCellValue("1");
		wb.getSheet("DATA").getRow(1).createCell(1).setCellValue("VIGNESH");
		wb.getSheet("DATA").getRow(1).createCell(2).setCellValue("BCA");
		wb.getSheet("DATA").getRow(1).createCell(3).setCellValue("2018");

		wb.getSheet("DATA").getRow(2).createCell(0).setCellValue("2");
		wb.getSheet("DATA").getRow(2).createCell(1).setCellValue("TAMIL");
		wb.getSheet("DATA").getRow(2).createCell(2).setCellValue("BE-mech");
		wb.getSheet("DATA").getRow(2).createCell(3).setCellValue("2019");

		wb.getSheet("DATA").getRow(3).createCell(0).setCellValue("3");
		wb.getSheet("DATA").getRow(3).createCell(1).setCellValue("AJIRALUK");
		wb.getSheet("DATA").getRow(3).createCell(2).setCellValue("BE-CS");
		wb.getSheet("DATA").getRow(3).createCell(3).setCellValue("2019");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		System.out.println("sucessfully inserted");

	}

}
