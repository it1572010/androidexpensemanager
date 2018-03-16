package com.anthony.androidexpensemanager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.anthony.androidexpensemanager.Entity.CategoryIncome;
import com.anthony.androidexpensemanager.Entity.IncomeData;
import com.anthony.androidexpensemanager.adapter.CategoryIncomeAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IncomeActivity extends AppCompatActivity {

    @BindView(R.id.txtTime)
    EditText txtTime;
    @BindView(R.id.txtMoney)
    EditText txtMoney;
    @BindView(R.id.txtInformation)
    EditText txtInformation;
    @BindView(R.id.cmbCategory)
    Spinner cmbCategory;
    private CategoryIncomeAdapter categoryIncomeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        ButterKnife.bind(this);
        categoryIncomeAdapter=new CategoryIncomeAdapter(this);
        cmbCategory.setAdapter(categoryIncomeAdapter);
        CategoryIncomeListTask categoryIncomeListTask=new CategoryIncomeListTask(this);
        categoryIncomeListTask.execute();
    }

    @OnClick(R.id.btnSubmit)
    void btnSubmitAction(){
        Intent moveToMenuActivity=new Intent(IncomeActivity.this,MenuActivity.class);
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
        String format = "dd/MM/YYYY";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format, Locale.US);
        txtTime.setText(simpleDateFormat.format(calendar.getTime()));
    }

    public void onClickTxtTime(View v){
        new DatePickerDialog(this,date,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    public void updateSpinnerWithData(ArrayList<CategoryIncome> categoryIncomes){
        if(null!=categoryIncomes){
            categoryIncomeAdapter.setCategoryIncomes(categoryIncomes);
        }
    }

    public void backToMenuActivity(IncomeData incomeData){
        if(null != incomeData && incomeData.getStatus()==1){
            Toast.makeText(this,incomeData.getMessage(),Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(IncomeActivity.this,MenuActivity.class);
            this.finish();
        }
        else{
            Toast.makeText(this,this.getResources().getString(R.string.add_income_failed),Toast.LENGTH_SHORT).show();
        }
    }
}
