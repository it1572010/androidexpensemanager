package com.anthony.androidexpensemanager.Entity;

import java.util.Date;

/**
 * Created by Win10 on 2/25/2018.
 */

public class Income {
    private int idIncome;
    private int moneyIncome;
    private String infomationIncome;
    private Date timeIncome;
    private User User_idUser;
    private CategoryIncome CategoryIncome_idCategoryIncome;

    public int getIdIncome() {
        return idIncome;
    }

    public void setIdIncome(int idIncome) {
        this.idIncome = idIncome;
    }

    public int getMoneyIncome() {
        return moneyIncome;
    }

    public void setMoneyIncome(int moneyIncome) {
        this.moneyIncome = moneyIncome;
    }

    public String getInfomationIncome() {
        return infomationIncome;
    }

    public void setInfomationIncome(String infomationIncome) {
        this.infomationIncome = infomationIncome;
    }

    public Date getTimeIncome() {
        return timeIncome;
    }

    public void setTimeIncome(Date timeIncome) {
        this.timeIncome = timeIncome;
    }

    public User getUser_idUser() {
        return User_idUser;
    }

    public void setUser_idUser(User user_idUser) {
        User_idUser = user_idUser;
    }

    public CategoryIncome getCategoryIncome_idCategoryIncome() {
        return CategoryIncome_idCategoryIncome;
    }

    public void setCategoryIncome_idCategoryIncome(CategoryIncome categoryIncome_idCategoryIncome) {
        CategoryIncome_idCategoryIncome = categoryIncome_idCategoryIncome;
    }
}
