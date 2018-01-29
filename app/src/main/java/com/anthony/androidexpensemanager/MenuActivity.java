package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @OnClick(R.id.btnNewIncome)
    void btnNewIncomeAction(){
        Intent moveToNewIncomeActivity=new Intent(MenuActivity.this,IncomeActivity.class);
        startActivity(moveToNewIncomeActivity);
    }

    @OnClick(R.id.btnNewExpense)
    void btnNewExpense(){
        Intent moveToNewExpenseActivity=new Intent(MenuActivity.this,ExpenseActivity.class);
        startActivity(moveToNewExpenseActivity);
    }
}
