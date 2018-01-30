package com.anthony.androidexpensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void btnSubmitAction(){
        Intent moveToMenuActivity=new Intent(SettingActivity.this,MenuActivity.class);
        startActivity(moveToMenuActivity);
    }
}
