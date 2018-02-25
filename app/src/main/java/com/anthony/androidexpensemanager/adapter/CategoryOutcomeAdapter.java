package com.anthony.androidexpensemanager.adapter;

import android.content.Context;

import com.anthony.androidexpensemanager.Entity.CategoryOutcome;

import java.util.ArrayList;

/**
 * Created by Win10 on 2/25/2018.
 */

public class CategoryOutcomeAdapter {
    private ArrayList<CategoryOutcome> categoryOutcomes;
    private Context context;

    public CategoryOutcomeAdapter(ArrayList<CategoryOutcome> categoryOutcomes, Context context) {
        this.categoryOutcomes = categoryOutcomes;
        this.context = context;
    }

    public ArrayList<CategoryOutcome> getCategoryOutcomes() {
        return categoryOutcomes;
    }

    public void setCategoryOutcomes(ArrayList<CategoryOutcome> categoryOutcomes) {
        this.categoryOutcomes = categoryOutcomes;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    //@Override
    public int getCount(){
        return categoryOutcomes.size();
    }

    //@Override
    public Object getCategoryOutcome(int position){
        return categoryOutcomes.get(position);
    }

    //@Override
    public long getCategoryOutcomeId(int position){
        return 0;
    }
}
