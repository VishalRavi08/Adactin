package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivern_writeData {
	
	public static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Dataset\\write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
//		Workbook wb = new XSSFWorkbook(f); ---InvalidFormatWxception
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("data11").createRow(0).createCell(0).setCellValue("email");
		wb.getSheet("data11").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("data11").createRow(1).createCell(0).setCellValue("abc@def.com");
		wb.getSheet("data11").getRow(1).createCell(1).setCellValue("hello");
				
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}
	
	public static void main(String[] args) throws IOException {
		writeData();
	}

}
