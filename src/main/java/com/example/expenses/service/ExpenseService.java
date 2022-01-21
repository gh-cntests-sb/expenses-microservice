package com.example.expenses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenses.model.expense.Expense;
import com.example.expenses.repository.IExpensesRepository;

@Service
public class ExpenseService {

	@Autowired
	IExpensesRepository expensesRepository;
	
	public Expense createExpense(Expense expense) {		
		expensesRepository.save(expense);
		return expense;
	}
}
