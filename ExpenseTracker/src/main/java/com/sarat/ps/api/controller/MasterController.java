package com.sarat.ps.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sarat.ps.api.model.Expense;
import com.sarat.ps.api.service.ExpenseService;

@Controller
public class MasterController {

	@Autowired
	private ExpenseService expenseService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Expenses");
		List<Expense> expense = expenseService.findAll();
		mav.addObject("expenses", expense);
		System.out.println(expense);
		return mav;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}

	@RequestMapping(value = "/expense", method = RequestMethod.POST)
	public String save(@Valid @ModelAttribute("expense") Expense expense) {
		expenseService.save(expense);
		return "redirect:/";
	}

	@RequestMapping(value = "/{id}/expense")
	public ModelAndView edit(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("updateexpense");
		System.out.println("inside edit");
		Expense expense = expenseService.findById(id);
		mav.addObject("expense", expense);
		System.out.println(mav);
		return mav;

	}

	@RequestMapping(value = "/expense/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		System.out.println("id ____ "+id);
		expenseService.delete(id);
		return "redirect:/";

	}
}
