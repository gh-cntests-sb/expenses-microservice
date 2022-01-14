package com.example.expenses.controller.to;

import java.util.Date;

import com.example.expenses.model.expense.ExpenseTypes;

public class ExpenseTO {
	
	private String expenseId;
	
	private ExpenseTypes expenseType;
	
	private Double expenseAmount;

	private Date expenseDate;

	public ExpenseTO() {		
	}

	public ExpenseTypes getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseTypes expenseType) {
		this.expenseType = expenseType;
	}

	public Double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	
}