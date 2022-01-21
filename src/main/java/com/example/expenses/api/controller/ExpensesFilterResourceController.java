package com.example.expenses.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenses.api.mapper.IExpensesFilterMapper;
import com.example.expenses.api.mapper.IExpensesTOMapper;
import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.controller.to.ExpensesFilterTO;
import com.example.expenses.model.expense.Expense;
import com.example.expenses.model.expense.filter.ExpensesFilter;
import com.example.expenses.service.IExpensesQueryService;

@RestController
@RequestMapping("/expenses")
public class ExpensesFilterResourceController {

	@Autowired
	IExpensesQueryService expensesQueryService;
	
	@Autowired
	IExpensesTOMapper expensesTOMapper;
	
	@Autowired
	IExpensesFilterMapper expensesFilterMapper;
	
	@GetMapping
	public List<ExpenseTO> getAllExpenses() {
		List<Expense> expenses = expensesQueryService.getAllExpenses();
		return expensesTOMapper.map(expenses);
	}
	
	@PostMapping("/filter")
	public List<ExpenseTO> getExpenses(@RequestBody ExpensesFilterTO expensesFilterTO) {
		ExpensesFilter expensesFilter = expensesFilterMapper.map(expensesFilterTO);
		List<Expense> expenses = expensesQueryService.getExpenses(expensesFilter);
		return expensesTOMapper.map(expenses);
	}
	
}
