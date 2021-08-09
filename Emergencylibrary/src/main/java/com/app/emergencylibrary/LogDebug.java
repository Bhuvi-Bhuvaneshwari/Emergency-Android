package com.app.emergencylibrary;

import android.util.Log;

public class LogDebug {
    private static final String TAG="SUPER_AWESOME_APP";

    private static void d(String message){
        Log.d(TAG,message);
    }
}
