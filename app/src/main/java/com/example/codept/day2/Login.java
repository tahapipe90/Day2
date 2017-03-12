package com.example.codept.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText uname,pass;
    private static Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login(){
        uname = (EditText) findViewById(R.id.u1);
        pass = (EditText)findViewById(R.id.p1);

        btn=(Button)findViewById(R.id.s);
        btn.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                       if (uname.getText().toString().equals("admin") &&pass.getText().toString().equals("admin"))
                       {
                           Toast.makeText(Login.this,"Login As Admin",Toast.LENGTH_SHORT).show();
                       }
                        else {
                           Toast.makeText(Login.this,"Login Unsucessfull",Toast.LENGTH_SHORT).show();
                       }
                    }
                }
        );

    }


}
