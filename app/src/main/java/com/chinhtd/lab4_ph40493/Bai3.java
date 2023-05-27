package com.chinhtd.lab4_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        Button button = findViewById(R.id.btn_dk);
        EditText editText =findViewById(R.id.edt1);
        EditText editText1 = findViewById(R.id.edt2);
        String user = getIntent().getStringExtra(Bai3_dangki.Key_username);
        String pass = getIntent().getStringExtra(Bai3_dangki.Key_password);
        editText.setText(user);
        editText1.setText(pass);
        Button button1 = findViewById(R.id.btn_dn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3_hihi.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3_dangki.class);
                startActivity(intent);
            }
        });
    }
}