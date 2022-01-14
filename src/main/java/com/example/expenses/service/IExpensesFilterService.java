package com.example.expenses.service;

import java.util.List;

import com.example.expenses.model.expense.Expense;

public interface IExpensesFilterService {

	List<Expense> getAllExpenses();

}