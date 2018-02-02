package com.anthony.androidexpensemanager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExpenseActivity extends AppCompatActivity {

    @BindView(R.id.txtTime)
    EditText txtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void btnSubmitAction(){
        Intent moveToMenuActivity=new Intent(ExpenseActivity.this,MenuActivity.class);
        startActivity(moveToMenuActivity);
    }

    Calendar calendar=Calendar.getInstance();
    DatePickerDialog.OnDateSetListener date=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                updateTxtTime();
        }
    };

    private void updateTxtTime(){
        String format = "MM/DD/YYYY";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format, Locale.US);
        txtTime.setText(simpleDateFormat.format(calendar.getTime()));
    }

    public void onClickTxtTime(View v){
        new DatePickerDialog(this,date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}
