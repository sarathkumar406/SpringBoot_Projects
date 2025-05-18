package com.net.test;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.http.HttpServletResponse;

public interface ExcelService {
	
	public List<MovieInfo> getMovieData();

	public void generateExcel(HttpServletResponse response) throws IOException;
}
