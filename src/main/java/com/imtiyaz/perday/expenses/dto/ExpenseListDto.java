package com.imtiyaz.perday.expenses.dto;

import java.util.ArrayList;
import java.util.List;

public class ExpenseListDto {
    private List<ExpenseDto> expenses;

    public ExpenseListDto() {
        this.expenses = new ArrayList<>();
    }

    public ExpenseListDto(List<ExpenseDto> expenses) {
        this.expenses = expenses;
    }

    public List<ExpenseDto> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<ExpenseDto> expenses) {
        this.expenses = expenses;
    }

    


}
