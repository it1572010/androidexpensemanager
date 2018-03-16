package com.anthony.androidexpensemanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.anthony.androidexpensemanager.Entity.Income;
import com.anthony.androidexpensemanager.R;

import java.util.ArrayList;

/**
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class UserIncomeAdapter extends BaseAdapter{

    private ArrayList<Income> incomes;
    private Context context;

    public UserIncomeAdapter(Context context) {
        this.context = context;
        incomes=new ArrayList<>();
    }

    public ArrayList<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(ArrayList<Income> incomes) {
        this.incomes = incomes;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return incomes.size();
    }

    @Override
    public Object getItem(int position) {
        return incomes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.user_income_row_layout,parent,false);
        }
        Income income= (Income) getItem(position);
        TextView textViewIncome=convertView.findViewById(R.id.txtIncome);
        textViewIncome.setText(income.getMoneyIncome());
        return convertView;
    }
}
