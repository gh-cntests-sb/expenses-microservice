package com.example.expenses.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;

@Component
public class ExpensesTOMapper implements IExpensesTOMapper {
	
	@Autowired
	IExpenseTOMapper expenseTOMapper;
	
	@Override
	public List<ExpenseTO> map(List<Expense> expenses) {
		return expenses.stream()
				.map(expenseTOMapper::map)
				.collect(Collectors.toList());
	}
	
}
