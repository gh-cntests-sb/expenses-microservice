package com.example.expenses.api.mapper;

import org.springframework.stereotype.Component;

import com.example.expenses.controller.to.ExpensesFilterTO;
import com.example.expenses.model.expense.filter.ExpensesFilter;

@Component
public class ExpensesFilterMapper implements IExpensesFilterMapper {

	@Override
	public ExpensesFilter map(ExpensesFilterTO expensesFilterTO) {
		ExpensesFilter expensesFilter = new ExpensesFilter();
		expensesFilter.setExpenseType(expensesFilterTO.getExpenseType());
		expensesFilter.setExpenseMinAmount(expensesFilterTO.getExpenseMinAmount());
		expensesFilter.setExpenseMaxAmount(expensesFilterTO.getExpenseMaxAmount());
		return expensesFilter;
	}
}
