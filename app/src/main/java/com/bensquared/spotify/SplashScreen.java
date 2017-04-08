package com.bensquared.spotify;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Window;

import static java.security.AccessController.getContext;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Log.i( "HAS", "LAST DEVICE" );
        Log.i( "HAS", "LAST DEVICE" );
        Log.i( "HAS", "LAST DEVICE" );
        Log.i( "HAS", "LAST DEVICE" );



        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                    Intent goToMain = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(goToMain);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    finish();
                }
            }
        };
        timer.start();
    }
}