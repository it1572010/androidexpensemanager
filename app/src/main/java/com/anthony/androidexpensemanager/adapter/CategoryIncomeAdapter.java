package com.anthony.androidexpensemanager.adapter;

import android.content.Context;

import com.anthony.androidexpensemanager.Entity.CategoryIncome;

import java.util.ArrayList;

/**
 * Created by Win10 on 2/25/2018.
 */

public class CategoryIncomeAdapter {
    private ArrayList<CategoryIncome> categoryIncomes;
    private Context context;

    public CategoryIncomeAdapter(ArrayList<CategoryIncome> categoryIncomes, Context context) {
        this.categoryIncomes = categoryIncomes;
        this.context = context;
    }

    public ArrayList<CategoryIncome> getCategoryIncomes() {
        return categoryIncomes;
    }

    public void setCategoryIncomes(ArrayList<CategoryIncome> categoryIncomes) {
        this.categoryIncomes = categoryIncomes;
    }

    //@Override
    public int getCount(){
        return categoryIncomes.size();
    }

    //@Override
    public Object getCategoryIncome(int position){
        return categoryIncomes.get(position);
    }

    //@Override
    public long getCategoryIncomeId(int position){
        return 0;
    }
}
