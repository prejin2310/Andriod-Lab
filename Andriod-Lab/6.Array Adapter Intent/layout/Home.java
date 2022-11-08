package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {
    TextView showText,showText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        showText=findViewById(R.id.showText);
        showText1=findViewById(R.id.showText1);
        Intent in=getIntent();
        String name=in.getStringExtra("Name");
        showText.setText("You selected course: "+name);
        String name1=in.getStringExtra("Name1");
        showText1.setText("You selected course: "+name1);
    }
}
