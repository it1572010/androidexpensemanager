package com.anthony.androidexpensemanager.Entity;

import java.util.Date;

/**
 * Created by Anthony (1572010) on 2/25/2018.
 */

public class Outcome {
    private int idOutcome;
    private int moneyOutcome;
    private String infomationOutcome;
    private Date timeOutcome;
    private User User_idUser;
    private CategoryOutcome CategoryOutcome_idCategoryOutcome;

    public int getIdOutcome() {
        return idOutcome;
    }

    public void setIdOutcome(int idOutcome) {
        this.idOutcome = idOutcome;
    }

    public int getMoneyOutcome() {
        return moneyOutcome;
    }

    public void setMoneyOutcome(int moneyOutcome) {
        this.moneyOutcome = moneyOutcome;
    }

    public String getInfomationOutcome() {
        return infomationOutcome;
    }

    public void setInfomationOutcome(String infomationOutcome) {
        this.infomationOutcome = infomationOutcome;
    }

    public Date getTimeOutcome() {
        return timeOutcome;
    }

    public void setTimeOutcome(Date timeOutcome) {
        this.timeOutcome = timeOutcome;
    }

    public User getUser_idUser() {
        return User_idUser;
    }

    public void setUser_idUser(User user_idUser) {
        User_idUser = user_idUser;
    }

    public CategoryOutcome getCategoryOutcome_idCategoryOutcome() {
        return CategoryOutcome_idCategoryOutcome;
    }

    public void setCategoryOutcome_idCategoryOutcome(CategoryOutcome categoryOutcome_idCategoryOutcome) {
        CategoryOutcome_idCategoryOutcome = categoryOutcome_idCategoryOutcome;
    }
}
