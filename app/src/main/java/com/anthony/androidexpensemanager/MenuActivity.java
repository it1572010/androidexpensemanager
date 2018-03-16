package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    public String temp;
    public int idUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        temp=getIntent().getStringExtra(Intent.EXTRA_TEXT);
        idUser=Integer.valueOf(temp);
    }

    @OnClick(R.id.btnNewIncome)
    void btnNewIncomeAction() {
        Intent moveToNewIncomeActivity = new Intent(MenuActivity.this, IncomeActivity.class);
        startActivity(moveToNewIncomeActivity);
    }

    @OnClick(R.id.btnNewExpense)
    void btnNewExpense() {
        Intent moveToNewExpenseActivity = new Intent(MenuActivity.this, ExpenseActivity.class);
        startActivity(moveToNewExpenseActivity);
    }

    @OnClick(R.id.btnIncome)
    void btnIncomeAction() {
        Intent moveToReportIncomeActivity = new Intent(MenuActivity.this, ReportIncomeActivity.class);
        startActivity(moveToReportIncomeActivity);
    }

    @OnClick(R.id.btnExpense)
    void btnExpenseAction() {
        Intent moveToReportExpenseActivity = new Intent(MenuActivity.this, ReportExpenseActivity.class);
        startActivity(moveToReportExpenseActivity);
    }

    @OnClick(R.id.btnLogout)
    void btnLogoutAction() {
        Intent moveToLoginActivity = new Intent(MenuActivity.this, loginActivity.class);
        startActivity(moveToLoginActivity);
    }

    @OnClick(R.id.btnSetting)
    void btnSettingAction() {
        Intent moveToSettingActivity = new Intent(MenuActivity.this, SettingActivity.class);
        startActivity(moveToSettingActivity);
    }
}
