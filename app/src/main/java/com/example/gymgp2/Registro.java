package com.example.gymgp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Registro extends AppCompatActivity {

    ImageView btnatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        casteo();

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),Login.class);
                startActivity(intencion);
            }
        });

    }

    public void casteo(){
        btnatras = (ImageView) findViewById(R.id.btnatras);
    }
}