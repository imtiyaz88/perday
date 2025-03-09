package com.imtiyaz.perday.expenses;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imtiyaz.perday.expenses.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    
}
