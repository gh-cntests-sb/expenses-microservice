package com.example.expenses.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.expenses.model.expense.Expense;
import com.example.expenses.model.expense.ExpenseTypes;

public interface IExpensesRepository extends CrudRepository<Expense, String> {
	
	public List<Expense> findByExpenseTypeAndExpenseAmountBetween
							(ExpenseTypes expenseType,
							Double expenseMinAmount,Double expenseMaxAmount);
}
