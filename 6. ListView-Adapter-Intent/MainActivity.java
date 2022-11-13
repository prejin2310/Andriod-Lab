package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);

        String items []=new String[] {"Python","Java","C++","TypeScript","React"};
        ArrayAdapter<String> arrayList=new ArrayAdapter<String>(this,R.layout.item,R.id.textlist,items);
        
        //connect the adapter
        listview.setAdapter(arrayList);

        //intent to next activity
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                value=items[i];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                Intent home=new Intent(MainActivity.this,Home.class);
                home.putExtra("Title",value);
                startActivity(home);
            }
        });

    }
}
