package com.imtiyaz.perday.expenses.transformer;

import org.springframework.stereotype.Component;

import com.imtiyaz.perday.expenses.dto.ExpenseDto;
import com.imtiyaz.perday.expenses.entity.Expense;


@Component
public class ExpenseTransformer implements Transformer<Expense, ExpenseDto>{

    @Override
    public Expense toEntity(ExpenseDto dto) {
        return new Expense(
            dto.getId(),
            dto.getName(),
            dto.getCategory(),
            dto.getDescription(),
            dto.getStartDate(),
            dto.getEndDate(),
            dto.getEstimatedEndDate());        
    }

    @Override
    public ExpenseDto toDto(Expense entity) {
        return new ExpenseDto(
            entity.getId(),
            entity.getName(),
            entity.getCategory(),
            entity.getDescription(),
            entity.getStartDate(),
            entity.getEndDate(),
            entity.getEstimatedEndDate()
        );
    }


    
}
