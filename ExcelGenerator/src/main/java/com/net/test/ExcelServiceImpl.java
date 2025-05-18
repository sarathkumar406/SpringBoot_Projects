package com.net.test;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ExcelServiceImpl implements ExcelService{

	@Autowired
	private ReportGenerator reportGenerator;
	
	@Override
	public List<MovieInfo> getMovieData() {
		
		return reportGenerator.findAll();
	}

	@Override
	public void generateExcel(HttpServletResponse response) throws IOException {
		
		List<MovieInfo> list = reportGenerator.findAll();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Movie_Info");
		HSSFRow row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("id");
		row.createCell(1).setCellValue("name");
		row.createCell(2).setCellValue("description");
		row.createCell(3).setCellValue("path");
		
		int dataRowIndex = 1;
		
		for(MovieInfo movie : list) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(movie.getId());
			dataRow.createCell(1).setCellValue(movie.getName());
			dataRow.createCell(2).setCellValue(movie.getDescription());
			dataRow.createCell(3).setCellValue(movie.getPath());
			dataRowIndex++;
		}
		
		ServletOutputStream servletOutputStream = response.getOutputStream();
		workbook.write(servletOutputStream);
		workbook.close();
		servletOutputStream.close(); 
		
	}

}

