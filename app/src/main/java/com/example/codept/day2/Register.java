package com.example.codept.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private static EditText name,email,pass,cpass;
    private static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();
    }

    public void register(){
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        cpass = (EditText) findViewById(R.id.repassword);
        btn = (Button) findViewById(R.id.register);

        btn.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        if (name.getText().toString().equals("admin")){
                            Toast.makeText(Register.this,"Name Already Exists",Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                }
        );

    }


}
