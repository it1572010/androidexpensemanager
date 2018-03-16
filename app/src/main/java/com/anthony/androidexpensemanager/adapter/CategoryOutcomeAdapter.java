package com.anthony.androidexpensemanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.anthony.androidexpensemanager.Entity.CategoryOutcome;
import com.anthony.androidexpensemanager.R;

import java.util.ArrayList;

/**
 * Created by Anthony (1572010) on 2/25/2018.
 */

public class CategoryOutcomeAdapter extends BaseAdapter{
    private ArrayList<CategoryOutcome> categoryOutcomes;
    private Context context;

    public CategoryOutcomeAdapter(Context context) {
        this.context = context;
        categoryOutcomes=new ArrayList<>();
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


    @Override
    public int getCount() {
        return categoryOutcomes.size();
    }

    @Override
    public Object getItem(int position) {
        return categoryOutcomes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.category_outcome_row_layout,parent,false);
        }
        CategoryOutcome categoryOutcome= (CategoryOutcome) getItem(position);
        TextView textViewCategoryIncomeName=convertView.findViewById(R.id.txtCategoryOutcome);
        textViewCategoryIncomeName.setText(categoryOutcome.getNameCategoryOutcome());
        return convertView;
    }
}
