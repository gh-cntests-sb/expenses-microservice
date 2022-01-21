package com.example.expenses.api.mapper;

import com.example.expenses.controller.to.ExpensesFilterTO;
import com.example.expenses.model.expense.filter.ExpensesFilter;

public interface IExpensesFilterMapper {

	ExpensesFilter map(ExpensesFilterTO expensesFilterTO);

}