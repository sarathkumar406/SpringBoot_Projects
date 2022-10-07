package com.sarat.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarat.ps.api.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
