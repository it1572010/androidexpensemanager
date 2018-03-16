package com.anthony.androidexpensemanager.Utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Anthony (1572010) on 2/13/2018.
 */

public class MyUtilities {
    public static final String IP_CONFIG = "http://10.0.2.2/AndroidExpenseManager_WS/";

    public static final String LOGIN_URL = IP_CONFIG+"service/userLoginService.php";
    public static final String ADD_USER_URL = IP_CONFIG+"service/addUserService.php";
    public static final String CATEGORY_INCOME_URL = IP_CONFIG+"service/getCategoriesIncomeService.php";
    public static final String CATEGORY_OUTCOME_URL = IP_CONFIG+"service/getCategoriesOutcomeService.php";
    public static final String USER_INCOME_URL = IP_CONFIG+"service/getIncomeService.php";
    public static final String USER_OUTCOME_URL = IP_CONFIG+"service/getOutcomeService.php";
    public static final String ADD_INCOME_URL = IP_CONFIG+"service/addIncomeService.php";
    public static final String ADD_OUTCOME_URL = IP_CONFIG+"service/addOutcomeService.php";
}
