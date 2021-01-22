package com.Excel.Sheet_Wor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	// To get the particular value in excel
	public static void particular_Data() throws Throwable {

		File f = new File("C:\\Users\\karthik\\eclipse-workspace\\Sheet_Word\\UserEmpdetails.xlsx");
		FileInputStream f1 = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(f1);

		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue; // convert the
			System.out.println(value);

		}

	}

	public static void all_data() throws Throwable {

		File f = new File("C:\\Users\\karthik\\eclipse-workspace\\Sheet_Word\\UserEmpdetails.xlsx");
		FileInputStream f1 = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(f1);

		Sheet sheetAt = wb.getSheetAt(0);

		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {

			Row row = sheetAt.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();

					System.out.println(stringCellValue);

				} else if (cellType.equals(cellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue;

					System.out.println(value);

				}

			}
		}

	}

	// To update the data from excel
	public static void create_sheet() throws Throwable {

		File f = new File("C:\\Users\\karthik\\Desktop\\Testcase.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(f1);

		Sheet createSheet = wb.createSheet("Testcase_1");

		Row createRow = createSheet.createRow(0);

		Cell createCell = createRow.createCell(0);

		createCell.setCellValue("Testcase ID");

		wb.getSheet("Testcase_1").getRow(0).createCell(1).setCellValue("comments");

		FileOutputStream f2 = new FileOutputStream(f);

		wb.write(f2);
		wb.close();

		System.out.println("printed");

	}

	public static void main(String[] args) throws Throwable {
//		particular_Data();
		all_data();
//		create_sheet();

	}

}
