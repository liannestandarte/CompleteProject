package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FacilitiesActivity extends AppCompatActivity {

    TextView name, email;
    SharedPreferences pref;
    String name_txt, email_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);

        pref = getSharedPreferences("AppPref", MODE_PRIVATE);
        Button back = (Button) findViewById(R.id.btnBack);
        Button logout = (Button) findViewById(R.id.btnLogout);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FacilitiesActivity.this, MenuActivity.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = pref.edit();
                edit.clear();
                edit.commit();
                startActivity(new Intent(FacilitiesActivity.this, LoginActivity.class));
            }
        });
    }
}