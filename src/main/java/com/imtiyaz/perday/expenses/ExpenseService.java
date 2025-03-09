package com.imtiyaz.perday.expenses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imtiyaz.perday.expenses.exception.NotFoundException;

import com.imtiyaz.perday.expenses.entity.Expense;

@Service
public class ExpenseService {
    
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> get() {
        return expenseRepository.findAll();
    }

    public Expense get(Long id) {
        return expenseRepository.findById(id).orElseThrow(() -> new NotFoundException("Expense not found."));
    }

    public Expense create(Expense expense) {
        return expenseRepository.save(expense);
    }

}
