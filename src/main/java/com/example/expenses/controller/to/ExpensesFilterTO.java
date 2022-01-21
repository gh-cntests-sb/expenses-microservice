package com.example.expenses.controller.to;

import com.example.expenses.model.expense.ExpenseTypes;

public class ExpensesFilterTO {
	
	private ExpenseTypes expenseType ;
	
	/**
	 *  Min and Max amounts to specify the range for the expense amount for the query
	 */
	private Double expenseMinAmount;

	private Double expenseMaxAmount;

	public ExpenseTypes getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseTypes expenseType) {
		this.expenseType = expenseType;
	}

	public Double getExpenseMinAmount() {
		return expenseMinAmount;
	}

	public void setExpenseMinAmount(Double expenseMinAmount) {
		this.expenseMinAmount = expenseMinAmount;
	}

	public Double getExpenseMaxAmount() {
		return expenseMaxAmount;
	}

	public void setExpenseMaxAmount(Double expenseMaxAmount) {
		this.expenseMaxAmount = expenseMaxAmount;
	}

}
