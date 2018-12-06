package com.example.ankitm.intercomhelpcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerIntercomUser();
    }

    public void showHelpCenter(View view) {
        Intercom.client().displayHelpCenter();
    }

    public void showMessenger(View view) {
        Registration registration = Registration.create()
                .withUserId("9958954682");
        Intercom.client().registerIdentifiedUser(registration);

        //open intercom messenger
        Intercom.client().displayMessenger();
    }
    
    private void registerIntercomUser() {
        Registration registration = Registration.create()
                .withUserId("9958954682");
        Intercom.client().registerIdentifiedUser(registration);
    }
}
