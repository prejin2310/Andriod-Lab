package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView List;
    String value,demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List=findViewById(R.id.List);
        String items []=new String[]{"Java","Python","C++"};
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this,R.layout.adapter,R.id.textView,items);
        List.setAdapter(myAdapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                value=items[i];
                demo="Testing";
                Toast.makeText(getApplicationContext(),items[i], Toast.LENGTH_SHORT).show();
                Intent in=new Intent(MainActivity.this,Home.class);
                in.putExtra("Name",value);
                in.putExtra("Name1",demo);
                startActivity(in);
            }
        });
    }
}
