package com.example.expenses.api.mapper;

import org.springframework.stereotype.Component;

import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;

@Component
public class ExpenseTOMapper implements IExpenseTOMapper {

	@Override
	public Expense map(ExpenseTO expenseTO) {
		Expense expense = new Expense();
		expense.setExpenseType(expenseTO.getExpenseType());
		expense.setExpenseAmount(expenseTO.getExpenseAmount());
		expense.setExpenseDate(expenseTO.getExpenseDate());
		return expense;
	}
	
	@Override
	public ExpenseTO map(Expense expense) {
		ExpenseTO expenseTO = new ExpenseTO();
		expense.setExpenseId(expense.getExpenseId());
		expenseTO.setExpenseType(expense.getExpenseType());
		expenseTO.setExpenseAmount(expense.getExpenseAmount());
		expenseTO.setExpenseDate(expense.getExpenseDate());		
		return expenseTO;
	}
}
