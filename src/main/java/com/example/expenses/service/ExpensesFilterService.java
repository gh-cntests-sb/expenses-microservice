package com.example.expenses.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenses.model.expense.Expense;
import com.example.expenses.repository.ExpensesRepository;

@Service
public class ExpensesFilterService implements IExpensesFilterService {

	@Autowired
	ExpensesRepository expensesRepository;
	
	@Override
	public List<Expense> getAllExpenses() {
		List<Expense> expenses = new ArrayList<Expense>();
		expensesRepository.findAll().iterator().forEachRemaining(expenses::add);
		return expenses;
	}
}
