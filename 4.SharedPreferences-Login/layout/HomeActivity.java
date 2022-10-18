package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView fname,femail;
    Button btnl;

    SharedPreferences sharedPreferences;

    private static final  String SHARED_PREF_NAME= "mypref";
    private static final  String KEY_NAME= "name";
    private static final  String KEY_EMAIL= "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fname=findViewById(R.id.fname);
        femail=findViewById(R.id.femail);
        btnl=findViewById(R.id.btnl);

        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String name=sharedPreferences.getString(KEY_NAME,null);
        String email=sharedPreferences.getString(KEY_EMAIL,null);

        if(name != null || email!=null){
            fname.setText("Full Name: "+name);
            femail.setText("Email ID: "+email);
        }
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Toast.makeText(HomeActivity.this,"Log out Sucessfull",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
