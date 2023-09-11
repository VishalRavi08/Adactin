package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Multiple {
	
	public static void readMultipleData() throws IOException {
		
		File f = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Dataset\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(1);
		
		for(int i=0;i<=6;i++) {
			Row row = sheetAt.getRow(i);
			
			for (int j = 0; j < 3; j++) {
				Cell cell = row.getCell(j);
				
				CellType typeOfCell = cell.getCellType();
				
				if (typeOfCell.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				
				else if (typeOfCell.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int intValue = (int) numericCellValue;	
					System.out.println(intValue);
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		readMultipleData();
	}

}
