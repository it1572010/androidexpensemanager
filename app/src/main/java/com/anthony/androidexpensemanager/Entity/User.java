package com.anthony.androidexpensemanager.Entity;

/**
 * Created by Anthony (1572010) on 2/25/2018.
 */

public class User {
    private int idUser;
    private String nameUser;
    private String emailUser;
    private String password;
    private int alokasiUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAlokasiUser() {
        return alokasiUser;
    }

    public void setAlokasiUser(int alokasiUser) {
        this.alokasiUser = alokasiUser;
    }
}
