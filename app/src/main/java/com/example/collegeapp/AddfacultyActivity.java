package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddfacultyActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getFacultyName,getDept,getQuali,getMobno,getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfaculty);
        ed1=(EditText) findViewById(R.id.Fname);
        ed2=(EditText) findViewById(R.id.Dept);
        ed3=(EditText) findViewById(R.id.Quali);
        ed4=(EditText) findViewById(R.id.Mobno);
        ed5=(EditText) findViewById(R.id.Email);
        b1=(AppCompatButton) findViewById(R.id.SUB);
        b2=(AppCompatButton) findViewById(R.id.BTDB);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyName = ed1.getText().toString();
                getDept = ed2.getText().toString();
                getQuali = ed3.getText().toString();
                getMobno = ed4.getText().toString();
                getEmail = ed5.getText().toString();
                Toast.makeText(getApplicationContext(), getFacultyName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDept, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getQuali, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getMobno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}