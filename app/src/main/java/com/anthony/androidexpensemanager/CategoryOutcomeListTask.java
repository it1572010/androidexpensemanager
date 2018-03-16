package com.anthony.androidexpensemanager;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.anthony.androidexpensemanager.Entity.CategoryOutcome;
import com.anthony.androidexpensemanager.Entity.UserData;
import com.anthony.androidexpensemanager.Utilities.MyUtilities;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anthony (1572010) on 3/13/2018.
 */

public class CategoryOutcomeListTask extends AsyncTask<Void,Void,ArrayList<CategoryOutcome>>{

    private Context context;

    public CategoryOutcomeListTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPostExecute(ArrayList<CategoryOutcome> categoryOutcomes) {
        super.onPostExecute(categoryOutcomes);
        ((ExpenseActivity)context).updateSpinnerWithData(categoryOutcomes);
    }

    @Override
    protected ArrayList<CategoryOutcome> doInBackground(Void... voids) {
        ArrayList<CategoryOutcome> categoryOutcomes=new ArrayList<>();
        Uri uri= Uri.parse(MyUtilities.CATEGORY_OUTCOME_URL).buildUpon().build();
        HttpURLConnection urlConnection=null;
        UserData userData=null;
        try {
            URL url=new URL(uri.toString());
            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(6000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int reponseCode=urlConnection.getResponseCode();
            if(reponseCode==HttpURLConnection.HTTP_OK){
                ObjectMapper objectMapper=new ObjectMapper();
                categoryOutcomes.addAll(Arrays.asList(objectMapper.readValue(url,CategoryOutcome[].class)));
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
        return categoryOutcomes;
    }
}
