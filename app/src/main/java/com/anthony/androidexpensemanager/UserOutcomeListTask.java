package com.anthony.androidexpensemanager;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.anthony.androidexpensemanager.Entity.Outcome;
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
 * Created by Anthony (1572010) on 3/15/2018.
 */

public class UserOutcomeListTask extends AsyncTask<Void,Void,ArrayList<Outcome>> {

    private Context context;

    public UserOutcomeListTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPostExecute(ArrayList<Outcome> outcomes) {
        super.onPostExecute(outcomes);
    }

    @Override
    protected ArrayList<Outcome> doInBackground(Void... voids) {
        ArrayList<Outcome> outcomes=new ArrayList<>();
        Uri uri=Uri.parse(MyUtilities.USER_OUTCOME_URL).buildUpon().build();
        HttpURLConnection urlConnection=null;
        UserData userData=null;
        try {
            URL url=new URL(uri.toString());
            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(6000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int responseCode = urlConnection.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK){
                ObjectMapper objectMapper=new ObjectMapper();
                outcomes.addAll(Arrays.asList(objectMapper.readValue(url,Outcome.class)));
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
        return outcomes;
    }
}
