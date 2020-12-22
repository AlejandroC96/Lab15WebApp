package com.example.webapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Interfawapp {
    Context context;
    WebView layout;

    Interfawapp(Context c){
        context = c;
    }

    @JavascriptInterface
    public void showToastMessage(String message){
        //Toast.makeText(context,message,Toast.LENGTH_LONG).show();
        Snackbar snackbar = Snackbar.make(layout,message,Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
