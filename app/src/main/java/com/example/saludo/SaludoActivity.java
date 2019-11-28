package com.example.saludo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        TextView tv_nombre = findViewById(R.id.tv_nombre);
        Intent intent = getIntent();
        if (intent.hasExtra("nombre")) {
            tv_nombre.setText(intent.getStringExtra("nombre"));

        }
    }
}
