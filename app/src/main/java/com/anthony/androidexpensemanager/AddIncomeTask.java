package com.anthony.androidexpensemanager;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.anthony.androidexpensemanager.Entity.IncomeData;
import com.anthony.androidexpensemanager.Utilities.MyUtilities;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Anthony (2571010) on 3/15/2018.
 */

public class AddIncomeTask extends AsyncTask<String,Void,IncomeData>{

    private Context context;

    public AddIncomeTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPostExecute(IncomeData incomeData) {
        super.onPostExecute(incomeData);
    }

    @Override
    protected IncomeData doInBackground(String... strings) {
        Uri uri=Uri.parse(MyUtilities.ADD_INCOME_URL).buildUpon().appendQueryParameter("moneyIncome",strings[0]).appendQueryParameter("&informationIncome",strings[1]).appendQueryParameter("timeIncome",strings[2]).appendQueryParameter("User_idUser",strings[3]).appendQueryParameter("Category_idCategoryIncome",strings[4]).build();
        IncomeData income=null;
        HttpURLConnection urlConnection=null;
        try {
            URL url=new URL(uri.toString());
            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(6000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int responseCode=urlConnection.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK){
                ObjectMapper objectMapper=new ObjectMapper();
                income=objectMapper.readValue(url,IncomeData.class);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(urlConnection!=null){
                urlConnection.disconnect();
            }
        }
        return income;
    }
}
