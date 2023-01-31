package com.example.pensioners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void startSignUpActivity(View v) {
        Intent intent=new Intent(SignInActivity.this, SignUpActivity.class);
        startActivity(intent);
    }


    public void startStartActivity(View v) {
        Intent intent=new Intent(SignInActivity.this, StartActivity.class);
        startActivity(intent);
    }
}