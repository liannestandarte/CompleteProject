package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AccommodationActivity extends AppCompatActivity {

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        pref = getSharedPreferences("AppPref", MODE_PRIVATE);

        @SuppressLint("WrongViewCast") Button deluxe = (Button) findViewById(R.id.deluxeimgbtn);
        @SuppressLint("WrongViewCast") Button one = (Button) findViewById(R.id.onesuiteimgbtn);
        @SuppressLint("WrongViewCast") Button two = (Button) findViewById(R.id.twosuiteimgbtn);
        @SuppressLint("WrongViewCast") Button three = (Button) findViewById(R.id.threesuiteimgbtn);
        Button logout = (Button) findViewById(R.id.btnLogout);
        Button back = (Button) findViewById(R.id.btnBack);

        deluxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccommodationActivity.this, "Deluxe Room reserved", Toast.LENGTH_SHORT).show();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccommodationActivity.this, "One Bedroom Suite reserved.", Toast.LENGTH_SHORT).show();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccommodationActivity.this,"Two Bedroom Suite reserved.", Toast.LENGTH_SHORT).show();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AccommodationActivity.this,"Three Bedroom Suite reserved.", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AccommodationActivity.this, MenuActivity.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = pref.edit();
                edit.clear();
                edit.commit();
                startActivity(new Intent(AccommodationActivity.this, LoginActivity.class));
            }
        });
    }


    protected void oneDisplay(View v) {
    }

    protected void twoDisplay(View v) {
        Toast.makeText(this, "Two Bedroom Suite reserved.", Toast.LENGTH_LONG).show();
    }

    protected void threeDisplay(View v) {
        Toast.makeText(this, "Three Bedroom Suite reserved.", Toast.LENGTH_LONG).show();
    }
}