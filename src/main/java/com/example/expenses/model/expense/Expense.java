package com.example.expenses.model.expense;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXPENSES")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String expenseId;
	
	@Column(name = "EXPENSE_TYPE")
	private ExpenseTypes expenseType;
	
	@Column(name= "EXPENSE_AMOUNT")
	private Double expenseAmount;
	
	@Column(name = "EXPENSE_DATE")
	private Date expenseDate;

	@Column (name = "EXPENSE_SYSTEM_CREATION_DATE" )
	private Date expenseCreationDate;

	
	public String getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
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

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Date getExpenseCreationDate() {
		return expenseCreationDate;
	}

	public void setExpenseCreationDate(Date expenseCreationDate) {
		this.expenseCreationDate = expenseCreationDate;
	}

}
