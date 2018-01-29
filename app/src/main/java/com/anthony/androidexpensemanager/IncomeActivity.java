package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;

public class IncomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
    }

    @OnClick(R.id.btnSubmit)
    void btnSubmitAction(){
        Intent moveToMenuActivity=new Intent(IncomeActivity.this,MenuActivity.class);
        startActivity(moveToMenuActivity);
    }
}
