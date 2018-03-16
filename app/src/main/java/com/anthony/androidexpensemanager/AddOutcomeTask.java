package com.anthony.androidexpensemanager;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.anthony.androidexpensemanager.Entity.OutcomeData;
import com.anthony.androidexpensemanager.Utilities.MyUtilities;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class AddOutcomeTask extends AsyncTask<String, Void, OutcomeData>{

    private Context context;

    public AddOutcomeTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPostExecute(OutcomeData outcomeData) {
        super.onPostExecute(outcomeData);
    }

    @Override
    protected OutcomeData doInBackground(String... strings) {
        Uri uri=Uri.parse(MyUtilities.ADD_OUTCOME_URL).buildUpon().appendQueryParameter("moneyOutcome",strings[0]).appendQueryParameter("&informationOutcome",strings[1]).appendQueryParameter("timeOutcome",strings[2]).appendQueryParameter("User_idUser",strings[3]).appendQueryParameter("Category_idCategoryOutcome",strings[4]).build();
        OutcomeData outcome=null;
        HttpURLConnection urlConnection=null;
        try {
            URL url=new URL(uri.toString());
            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(6000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int responseCode=urlConnection.getResponseCode();
            if (responseCode==HttpURLConnection.HTTP_OK){
                ObjectMapper objectMapper=new ObjectMapper();
                outcome=objectMapper.readValue(url,OutcomeData.class);
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
        return outcome;
    }
}
