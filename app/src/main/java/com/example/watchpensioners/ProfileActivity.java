package com.example.watchpensioners;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.watchpensioners.databinding.ActivityMainBinding;

public class ProfileActivity extends Activity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void startExitActivity(View v) {
        this.finishAffinity();
    }
}