package com.example.expenses.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.expenses.model.expense.Expense;

public interface ExpensesRepository extends CrudRepository<Expense, String> {
	
}
