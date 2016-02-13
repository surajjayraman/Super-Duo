package it.jaschke.alexandria;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Suraj on 10-02-2016.
 */
public class Utility {

    public static boolean isNetworkAvailable(Context c) {

        ConnectivityManager connectivityManager = (ConnectivityManager)
                c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        return  info != null && info.isConnectedOrConnecting();
    }
}
