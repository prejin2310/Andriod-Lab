package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email;
    Button btn;
    SharedPreferences sharedPreferences;

    private static final  String SHARED_PREF_NAME= "mypref";
    private static final  String KEY_NAME= "name";
    private static final  String KEY_EMAIL= "email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        btn=findViewById(R.id.btn);
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name1=sharedPreferences.getString(KEY_NAME,null);
        if(name1 !=null){
            Intent intent=new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_NAME,name.getText().toString());
                editor.putString(KEY_EMAIL,email.getText().toString());
                editor.apply();
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"Login Sucessfull",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
