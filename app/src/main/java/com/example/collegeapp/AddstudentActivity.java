package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddstudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
String getName,getRollno,getAddno,getClg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstudent);
        ed1=(EditText) findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.Rollno);
        ed3=(EditText) findViewById(R.id.Addno);
        ed4=(EditText) findViewById(R.id.Clg);
        b1=(AppCompatButton) findViewById(R.id.SUB);
        b2=(AppCompatButton) findViewById(R.id.BTD);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getRollno=ed2.getText().toString();
                getAddno=ed3.getText().toString();
                getClg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRollno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getAddno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getClg,Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}