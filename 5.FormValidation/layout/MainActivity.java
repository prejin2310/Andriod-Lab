package com.example.validation;
import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText pass, mail, phno;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.et_mail);
        pass = findViewById(R.id.et_pass);
        phno = findViewById(R.id.et_phno);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mail.getText().toString();
                String passw = pass.getText().toString();
                String num = phno.getText().toString();

                validate(email, passw, num);
            }
        });


    }

    private  void validate(String email, String passw, String num) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (!email.matches(emailPattern)) {
                mail.setError("Invalid Mail Id");
                Toast.makeText(getApplicationContext(),"Invalid Mail Id",Toast.LENGTH_SHORT).show();
            }
        else if(email.length()==0){
            mail.setError("This field is required");
            Toast.makeText(getApplicationContext(),"Email is required",Toast.LENGTH_SHORT).show();
        }


          else  if (pass.length() == 0) {
                pass.setError("Password is required");
                Toast.makeText(getApplicationContext(),"Password is required",Toast.LENGTH_SHORT).show();

            }
            else if (pass.length() < 8) {
                pass.setError("Password must be minimum 8 characters");
                Toast.makeText(getApplicationContext(),"Password must be minimum 8 characters",Toast.LENGTH_SHORT).show();

            }

            else if (phno.length() == 0) {
                phno.setError("Phone Number is required");
                Toast.makeText(getApplicationContext(),"Phone Number is required",Toast.LENGTH_SHORT).show();

            }


        }
}
