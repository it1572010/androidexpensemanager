package com.anthony.androidexpensemanager.Entity;

/**
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class IncomeData {
    private int status;
    private String message;
    private Income income;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }
}
