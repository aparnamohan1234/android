package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4,b5,b6;
    SharedPreferences MyPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1=(AppCompatButton) findViewById(R.id.ADDSTU);
        b2=(AppCompatButton) findViewById(R.id.ADDFACU);
        b3=(AppCompatButton) findViewById(R.id.SRSTU);
        b4=(AppCompatButton) findViewById(R.id.SRFCUTY);
        b5=(AppCompatButton) findViewById(R.id.VIEWWEB);
        b6=(AppCompatButton)findViewById(R.id.out);
        MyPreferences=getSharedPreferences("login",MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),AddstudentActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),AddfacultyActivity.class);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchstudentActivity.class);
                startActivity(i);

                }







        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchfacultyActivity.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewwebsiteActivity.class);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor MyEdit=MyPreferences.edit();
                MyEdit.clear();
                MyEdit.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });



    }
}