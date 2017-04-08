package com.bensquared.spotify;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This finds the login Button, the field to grab the login email, and the field
        //to grab the login password.
        Button loginButton = (Button)findViewById(R.id.loginButton);
        EditText loginText = (EditText)findViewById(R.id.login);
        EditText loginPassword = (EditText)findViewById(R.id.password);

        final Handler handler = new Handler();


        //Sets the builder to build alerts to say "Hello John Doe".
        AlertDialog.Builder Builder = new AlertDialog.Builder(this);
        Builder.setMessage("Hello John Doe.");

        //Creates the alert
        final AlertDialog alert = Builder.create();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                       //Shows the alert on button press
                        alert.show();
                Thread timer = new Thread(){
                    @Override
                    public void run() {
                        try{
                            sleep(2000);
                            alert.dismiss();
                            Intent needLotHaveLot = new Intent(getBaseContext(), NeedLotHaveLot.class);
                            startActivity(needLotHaveLot);
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                };
                timer.start();
                }
        });




//        final Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                if (alert.isShowing()) {
//                    alert.dismiss();
//                }
//            }
//        };
//        try {
//            runnable.wait(2000);
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//        alert.setOnDismissListener(new DialogInterface.OnDismissListener() {
//            @Override
//           public void onDismiss(DialogInterface dialog) {
//                        handler.removeCallbacks();
//            }
//        });
//
//        handler.postDelayed(runnable, 2000);

            }
        }


