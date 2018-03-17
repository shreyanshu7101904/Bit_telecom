package com.telecom.bit.bit_telecom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.view.KeyEvent;


public class collegeweb extends AppCompatActivity {
    private WebView collwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        //setContentView(R.layout.activity_facultywebview);
        collwebview=new WebView(this);
        collwebview.loadUrl("http://bit-bangalore.edu.in/");
        collwebview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
        this.setContentView(collwebview);
    }
    @Override
    public boolean onKeyDown(final int keycode,final KeyEvent event) {
        if ((keycode == KeyEvent.KEYCODE_BACK) && collwebview.canGoBack()) {
            collwebview.goBack();
            return true;
        }
        return super.onKeyDown(keycode,event);
    }
}
