package com.chinhtd.lab4_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bai3_hihi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_hihi);
        TextView textView =findViewById(R.id.tv_tk);
        TextView textView1 =findViewById(R.id.tv_mk);
        String tv = getIntent().getStringExtra(Bai3_dangki.Key_username);
        String tv2 = getIntent().getStringExtra(Bai3_dangki.Key_password);
        textView.setText(tv);
        textView1.setText(tv2);
    }
}