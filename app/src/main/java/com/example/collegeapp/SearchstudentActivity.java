package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchstudentActivity extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    String getAddNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchstudent);
        ed1=(EditText) findViewById(R.id.Addno);
        b1=(AppCompatButton) findViewById(R.id.SRCH);
        b2=(AppCompatButton) findViewById(R.id.BTDB);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAddNo=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getAddNo, Toast.LENGTH_SHORT).show();
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