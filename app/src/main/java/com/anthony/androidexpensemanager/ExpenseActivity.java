package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;

public class ExpenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
    }

    @OnClick(R.id.btnSubmit)
    void btnSubmitAction(){
        Intent moveToMenuActivity=new Intent(ExpenseActivity.this,MenuActivity.class);
        startActivity(moveToMenuActivity);
    }
}
