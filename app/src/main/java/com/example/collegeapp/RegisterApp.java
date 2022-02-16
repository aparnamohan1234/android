package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterApp extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getName,getMobNo,getEmailid,getPassword,getConfirmpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_app);
        ed1=(EditText) findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.Mobno);
        ed3=(EditText) findViewById(R.id.Email);
        ed4=(EditText) findViewById(R.id.PASS);
        ed5=(EditText) findViewById(R.id.CMP);
        b1=(AppCompatButton) findViewById(R.id.REG);
        b2=(AppCompatButton)findViewById(R.id.BTL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMobNo=ed2.getText().toString();
                getEmailid=ed3.getText().toString();
                getPassword=ed4.getText().toString();
                getConfirmpass=ed5.getText().toString();
                if (getPassword.equals(getConfirmpass)) {
                    Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getMobNo, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getEmailid, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getConfirmpass, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Password and Confirm Password doesn't match", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}