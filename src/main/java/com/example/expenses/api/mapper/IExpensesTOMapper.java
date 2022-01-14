package com.example.expenses.api.mapper;

import java.util.List;

import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;

public interface IExpensesTOMapper {

	List<ExpenseTO> map(List<Expense> expenses);

}