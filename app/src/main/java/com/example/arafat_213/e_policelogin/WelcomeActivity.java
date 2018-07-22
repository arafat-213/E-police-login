package com.example.arafat_213.e_policelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void toPoliceLogin(View view){
        Intent intent = new Intent(WelcomeActivity.this, PoliceLogin.class);
        startActivity(intent);
    }


    public void toCitizenLogin(View view){
        Intent intent = new Intent(WelcomeActivity.this, CitizenLogin.class);
        startActivity(intent);
    }
}
