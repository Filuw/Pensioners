package com.example.watchpensioners;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.watchpensioners.databinding.ActivityMainBinding;

public class LoginActivity extends Activity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void startProfileActivity(View v) {
        Intent intent=new Intent(LoginActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}