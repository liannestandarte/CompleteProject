package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int time = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
                overridePendingTransition(R.anim.fadein,R.anim.fadeout);
                finish();
            }
        },time);
    }
}
