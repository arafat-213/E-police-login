package com.example.arafat_213.e_policelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private final int POLICE_LOGIN = 1;
    private final int CITIZEN_LOGIN = 2;
    private int loginType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        loginType = intent.getIntExtra("loginType", 0);
        if (loginType == POLICE_LOGIN) {
            Toast.makeText(LoginActivity.this, "Police log in", Toast.LENGTH_SHORT).show();
        } else if (loginType == CITIZEN_LOGIN) {
            Toast.makeText(LoginActivity.this, "Citizen log in", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(LoginActivity.this, "Arfeee ne locha mara", Toast.LENGTH_SHORT).show();
        }
    }

}
