package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,email,phone,adds;
    Button Validate;
    RadioGroup radioGroup;
    RadioButton radioButton;
    CheckBox mala,eng,hin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adds=findViewById(R.id.adds);
        radioGroup=findViewById(R.id.radioGroup);
        Validate=findViewById(R.id.Validate);
        mala=findViewById(R.id.mala);
        eng=findViewById(R.id.eng);
        hin=findViewById(R.id.hin);

        //get text form edittext


        Validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=fname.getText().toString();
                String mail= email.getText().toString();
                String num=phone.getText().toString();
                String add=adds.getText().toString();
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);

                //validation
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                }
                else if(mail.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Mail id", Toast.LENGTH_SHORT).show();
                }
                else if(num.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
                }
                else if(num.length()<10){
                    Toast.makeText(MainActivity.this, "Enter a Valid number", Toast.LENGTH_SHORT).show();
                }

                //for validate radio button

                else if(radioId == -1){
                    Toast.makeText(MainActivity.this, "Please select gender", Toast.LENGTH_SHORT).show();
                }

                //validate checkbox

                else if(!mala.isChecked() && !eng.isChecked() && !hin.isChecked()){
                    Toast.makeText(MainActivity.this, "Please select Languages", Toast.LENGTH_SHORT).show();

                }
                else if(add.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter your Address", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
