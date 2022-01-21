package com.example.expenses.api.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.expenses.api.mapper.IExpenseTOMapper;
import com.example.expenses.controller.to.ExpenseTO;
import com.example.expenses.model.expense.Expense;
import com.example.expenses.service.ExpenseService;
import com.example.expenses.service.IExpensesQueryService;

@RestController
@RequestMapping("/expense")
public class ExpenseResourceController {

	@Autowired
	ExpenseService expenseService;
	
	@Autowired
	IExpenseTOMapper expenseTOMapper;
	
	@Autowired
	IExpensesQueryService expensesQueryServce;

	final Logger logger = LoggerFactory.getLogger(ExpenseResourceController.class);
			 
	@PostMapping
	public ExpenseTO createExpense(@RequestBody ExpenseTO expenseTO) {
		Expense expense = expenseTOMapper.map(expenseTO);		
		Expense rExpense = expenseService.createExpense(expense);
		return expenseTOMapper.map(rExpense);
	}

	@GetMapping
	public ExpenseTO getExpense(@PathVariable String id) {
		
		logger.info("expense id: {id})",id);
		
		Optional<Expense> optionalExpense = expensesQueryServce.getExpense(id);
		if ( optionalExpense.isEmpty() ) {
			throw new ResponseStatusException(
					  HttpStatus.NOT_FOUND );
		} else {
			return expenseTOMapper.map(optionalExpense.get());
		}
	}

}
