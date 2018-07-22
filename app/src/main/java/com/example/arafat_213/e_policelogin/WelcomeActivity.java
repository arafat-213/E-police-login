package com.example.arafat_213.e_policelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    private final int POLICE_LOGIN = 1;
    private final int CITIZEN_LOGIN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void toPoliceLogin(View view) {
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        intent.putExtra("loginType", POLICE_LOGIN);
        startActivity(intent);
    }


    public void toCitizenLogin(View view) {
        Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
        intent.putExtra("loginType", CITIZEN_LOGIN);
        startActivity(intent);
    }
}
