package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView hometxt;
    Button homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        hometxt=findViewById(R.id.hometxt);
        homebtn=findViewById(R.id.homebtn);

        Intent home=getIntent();
        String picktext=home.getStringExtra("Title");
        hometxt.setText("You selected : "+picktext);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(Home.this,MainActivity.class);
                startActivity(back);

            }
        });

    }
}
