package com.example.expenses.api.mapper;

import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;

public interface IExpenseTOMapper {

	Expense map(ExpenseTO expenseTO);

	ExpenseTO map(Expense expense);

}