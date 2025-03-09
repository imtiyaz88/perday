package com.imtiyaz.perday.expenses.dto;

import java.util.Calendar;

import com.imtiyaz.perday.expenses.entity.ExpenseCategory;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExpenseDto {
    
    private Long Id;
    @NotBlank
    private String name;
    @NotNull
    private ExpenseCategory category;
    @NotBlank
    private String description;
    private Calendar startDate;
    private Calendar endDate;
    private Calendar estimatedEndDate;

    public ExpenseDto(Long id, @NotBlank String name, @NotNull ExpenseCategory category, @NotBlank String description,
            Calendar startDate, Calendar endDate, Calendar estimatedEndDate) {
        Id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estimatedEndDate = estimatedEndDate;
    }

    public ExpenseDto() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Calendar getEstimatedEndDate() {
        return estimatedEndDate;
    }

    public void setEstimatedEndDate(Calendar estimatedEndDate) {
        this.estimatedEndDate = estimatedEndDate;
    }

    
}
