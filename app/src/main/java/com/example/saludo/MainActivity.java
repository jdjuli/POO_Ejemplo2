package com.example.saludo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_nombre = findViewById(R.id.et_nombre);
        Button bt_saludame = findViewById(R.id.bt_saludame);
        bt_saludame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = et_nombre.getText().toString().trim();
                if (nombre.isEmpty()) {
                    Toast.makeText(MainActivity.this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent = new Intent(getApplicationContext(), SaludoActivity.class);
                    intent.putExtra("nombre", nombre);
                    startActivity(intent);
                }
            }
        });

    }
}
