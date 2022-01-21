package com.example.expenses.service;

import java.util.List;
import java.util.Optional;

import com.example.expenses.model.expense.Expense;
import com.example.expenses.model.expense.filter.ExpensesFilter;

public interface IExpensesQueryService {

	List<Expense> getAllExpenses();

	List<Expense> getExpenses(ExpensesFilter expensesFilter);

	Optional<Expense> getExpense(String id);

}