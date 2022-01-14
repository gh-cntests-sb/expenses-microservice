package com.example.expenses.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.expenses.api.mapper.IExpenseTOMapper;
import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;
import com.example.expenses.model.expense.ExpenseTypes;
import com.example.expenses.service.ExpenseService;

@RestController
@RequestMapping("/expense")
public class ExpenseResourceController {

	@Autowired ExpenseService expenseService;
	@Autowired IExpenseTOMapper expenseTOMapper;
	
	@PostMapping
	@ResponseBody
	ExpenseTO createExpense(@RequestBody ExpenseTO expenseTO) {
		Expense expense = expenseTOMapper.map(expenseTO);		
		Expense rExpense = expenseService.createExpense(expense);
		return expenseTOMapper.map(rExpense);
	}
	
}
