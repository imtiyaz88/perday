package com.imtiyaz.perday.expenses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imtiyaz.perday.expenses.dto.ExpenseDto;
import com.imtiyaz.perday.expenses.dto.ExpenseListDto;
import com.imtiyaz.perday.expenses.entity.Expense;
import com.imtiyaz.perday.expenses.transformer.ExpenseTransformer;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    
    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private ExpenseTransformer expenseTransformer;

    @GetMapping
    public ResponseEntity<ExpenseListDto> getAllExpenses() {
        ExpenseListDto expenseListDto = new ExpenseListDto();
        expenseService.get().forEach((each) -> expenseListDto.getExpenses().add(expenseTransformer.toDto(each)));
        return ResponseEntity.ok().body(expenseListDto);
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ExpenseDto> getExpense(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(expenseTransformer.toDto(expenseService.get(id)));
    }

    @PostMapping
    public ResponseEntity<Expense> createExpense(@Valid @RequestBody ExpenseDto expense) {
        return ResponseEntity.ok().body(expenseService.create(expenseTransformer.toEntity(expense)));
    }


}
