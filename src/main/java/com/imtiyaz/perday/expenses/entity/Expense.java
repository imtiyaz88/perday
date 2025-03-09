package com.imtiyaz.perday.expenses.entity;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Expense{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Expense() {
    }

    public Expense(Long id, String name, ExpenseCategory category, String description, Calendar startDate, Calendar endDate,
            Calendar estimatedEndDate) {
        Id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estimatedEndDate = estimatedEndDate;
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