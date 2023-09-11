package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	
	public static void readParticularData() throws IOException {
		
		File f = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Dataset\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheet("Sheet2");
//		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		
		CellType typeOfCell = cell.getCellType(); //Enum
		
		if (typeOfCell.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		
		else if (typeOfCell.equals(CellType.NUMERIC)){
			double numericCellValue = cell.getNumericCellValue();
			int intValue = (int) numericCellValue;
			System.out.println(intValue);
//			System.out.println(cell.getNumericCellValue());
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		readParticularData();
		
	}

}
