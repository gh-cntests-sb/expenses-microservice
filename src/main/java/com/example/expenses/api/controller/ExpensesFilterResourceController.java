package com.example.expenses.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenses.api.mapper.IExpensesTOMapper;
import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;
import com.example.expenses.service.IExpensesFilterService;

@RestController
@RequestMapping("/expenses")
public class ExpensesFilterResourceController {

	@Autowired
	IExpensesFilterService expensesFilterService;
	
	@Autowired
	IExpensesTOMapper expensesTOMapper;
	
	@GetMapping
	@ResponseBody
	public List<ExpenseTO> getAllExpenses() {
		List<Expense> expenses = expensesFilterService.getAllExpenses();
		return expensesTOMapper.map(expenses);
	}
	
}
