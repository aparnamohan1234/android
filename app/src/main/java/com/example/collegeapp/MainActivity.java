package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getEmailid,getPassword,PrefValue;
    SharedPreferences MyPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.Email);
        ed2=(EditText)findViewById(R.id.Pass);
        b1=(AppCompatButton) findViewById(R.id.LGN);
        b2=(AppCompatButton) findViewById(R.id.GTR);
        MyPreferences=getSharedPreferences("login",MODE_PRIVATE);

        PrefValue=MyPreferences.getString("Email",null);
         if (PrefValue!=null)
         {
             Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
             startActivity(i);
         }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmailid=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                if(getEmailid.equals("admin@gmail.com")&& getPassword.equals("12345"))
                {
                    SharedPreferences.Editor MyEdit=MyPreferences.edit();
                    MyEdit.putString( "Email",getEmailid);
                    MyEdit.commit();
                    Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid credentials", Toast.LENGTH_SHORT).show();
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),RegisterApp.class);
                startActivity(i);

            }
        });


    }
}