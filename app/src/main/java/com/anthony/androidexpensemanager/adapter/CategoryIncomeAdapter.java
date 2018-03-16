package com.anthony.androidexpensemanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.anthony.androidexpensemanager.Entity.CategoryIncome;
import com.anthony.androidexpensemanager.R;

import java.util.ArrayList;

/**
 * Created by Anthony (1572010) on 2/25/2018.
 */

public class CategoryIncomeAdapter extends BaseAdapter{
    private ArrayList<CategoryIncome> categoryIncomes;
    private Context context;

    public CategoryIncomeAdapter(Context context) {
        this.context = context;
        categoryIncomes=new ArrayList<>();
    }

    public ArrayList<CategoryIncome> getCategoryIncomes() {
        return categoryIncomes;
    }

    public void setCategoryIncomes(ArrayList<CategoryIncome> categoryIncomes) {
        this.categoryIncomes = categoryIncomes;
    }

    @Override
    public int getCount() {
        return categoryIncomes.size();
    }

    @Override
    public Object getItem(int position) {
        return categoryIncomes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.category_income_row_layout,parent,false);
        }
        CategoryIncome categoryIncome= (CategoryIncome) getItem(position);
        TextView textViewCategoryIncomeName=convertView.findViewById(R.id.txtCategoryIncome);
        textViewCategoryIncomeName.setText(categoryIncome.getNameCategoryIncome());
        return convertView;
    }
}
