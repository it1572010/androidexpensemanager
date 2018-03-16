package com.anthony.androidexpensemanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.anthony.androidexpensemanager.Entity.Outcome;
import com.anthony.androidexpensemanager.R;

import java.util.ArrayList;

/**
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class UserExpenseAdapter extends BaseAdapter {
    private ArrayList<Outcome> outcomes;
    private Context context;

    public UserExpenseAdapter(Context context) {
        this.context = context;
        outcomes=new ArrayList<>();
    }

    public ArrayList<Outcome> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(ArrayList<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return outcomes.size();
    }

    @Override
    public Object getItem(int position) {
        return outcomes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.user_outcome_row_layout,parent,false);
        }
        Outcome outcome= (Outcome) getItem(position);
        TextView textViewOutcome=convertView.findViewById(R.id.txtOutcome);
        textViewOutcome.setText(outcome.getMoneyOutcome());
        return convertView;
    }
}
