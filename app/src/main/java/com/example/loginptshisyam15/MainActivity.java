package com.example.loginptshisyam15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText loginemail, loginPassword;
    Button Buttonlogin, btnlogin, btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginemail = (EditText)findViewById(R.id.loginemail);
        loginPassword = (EditText)findViewById(R.id.loginPassword);
        Buttonlogin = (Button)findViewById(R.id.Buttonlogin);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        btnsignup =(Button)findViewById(R.id.btnsignup);
        Buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aksi disini
                String email = loginemail.getText().toString();
                String password = loginPassword.getText().toString();
                if (email.equalsIgnoreCase("hishisyam80@gmail.com")
                        && password.equalsIgnoreCase("Hisyam ganteng")){
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this , menu.class);
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sukses Sign up", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MainActivity.this , Signup.class);
                startActivity(move);
            }
        });

    }

}