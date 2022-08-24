package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText usr,pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        btn=findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=usr.getText().toString();
                String b=pass.getText().toString();
                if(a.isEmpty()){
                    usr.setError("Username Empty not Allowed");
                    Toast.makeText(MainActivity.this,"Username Empty not Allowed",Toast.LENGTH_SHORT).show();
                }
                if(b.isEmpty()){
                    pass.setError("Password Empty not Allowed");
                    Toast.makeText(MainActivity.this,"Password Empty not Allowed",Toast.LENGTH_SHORT).show();
                }
                if(a.equals("admin") && b.equals("admin")){
                    Toast.makeText(MainActivity.this,"Login Sucessfully",Toast.LENGTH_SHORT).show();
                }
                if(!a.equals("admin") || !b.equals("admin")){
                    Toast.makeText(MainActivity.this,"Username or Password Incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
