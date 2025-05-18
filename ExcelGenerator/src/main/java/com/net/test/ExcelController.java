package com.net.test;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/Excel")
public class ExcelController {
	
	@Autowired
	private ExcelService excelService;
	
	@GetMapping("/getMovieData")
	public List<MovieInfo> getMovieData(){
		
		return excelService.getMovieData(); 
	}
	
	@GetMapping("/DownloadData")
	public void generateExcelReport(HttpServletResponse response) throws IOException {
		
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=movie.xls";
		
		response.setHeader(headerKey, headerValue);
		
		excelService.generateExcel(response);
	}

}
