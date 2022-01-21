package com.example.expenses.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenses.model.expense.Expense;
import com.example.expenses.model.expense.filter.ExpensesFilter;
import com.example.expenses.repository.IExpensesRepository;

@Service
public class ExpensesQueryService implements IExpensesQueryService {

	@Autowired
	IExpensesRepository expensesRepository;
	
	@Override
	public List<Expense> getAllExpenses() {
		List<Expense> expenses = new ArrayList<Expense>();
		expensesRepository.findAll().forEach(expenses::add);
		return expenses;
	}
	
	@Override
	public List<Expense> getExpenses(ExpensesFilter expensesFilter) {
		List<Expense> expenses = new ArrayList<Expense>();		
		expensesRepository.findByExpenseTypeAndExpenseAmountBetween(expensesFilter.getExpenseType(), 
				expensesFilter.getExpenseMinAmount(), expensesFilter.getExpenseMaxAmount())
				.forEach(expenses::add);
		return expenses;
	}
	
	// Need to implement ExpenseNotFoundException
	@Override
	public Optional<Expense> getExpense(String id) {
		return expensesRepository.findById(id);
	}
}
