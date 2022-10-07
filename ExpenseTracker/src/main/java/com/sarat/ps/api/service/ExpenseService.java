package com.sarat.ps.api.service;

import java.util.List;

import com.sarat.ps.api.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();

	void save(Expense expense);

	Expense findById(Long id);
	
	void delete(Long id);

}
