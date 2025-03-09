package com.imtiyaz.perday.expenses.entity;

public enum ExpenseCategory {
    NEEDS("NEEDS"),
    WANTS("WANTS"),
    LUXURY("LUXURY");

    public String value;

    private ExpenseCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public ExpenseCategory setValue(String value) {
        this.value = value;
        return this;
    }

    

}
