package com.chinhtd.lab4_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;

public class Bai2 extends AppCompatActivity {
    public static String KEY_GIA = "gia";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        EditText edtgia = findViewById(R.id.edt_mua);
        TextView textView =findViewById(R.id.gia);
        Button button = findViewById(R.id.btn_gui);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gia = edtgia.getText().toString();
                if (gia.equals("")||gia==null){
                    Toast.makeText(Bai2.this, "Bạn chưa nhập thứ cần mua", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getApplicationContext(), Bai2_p2.class);
                    intent.putExtra(KEY_GIA,gia);
                    startActivity(intent);
                }
            }
        });
        String gia_sp = getIntent().getStringExtra(Bai2_p2.Key_gia);
        textView.setText(gia_sp);
    }
}