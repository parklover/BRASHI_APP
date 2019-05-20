package com.example.brashi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lista extends AppCompatActivity {

    public Button mapaOdnosnik;

    public void init(){
        mapaOdnosnik = (Button)findViewById(R.id.buttonMapa);
        mapaOdnosnik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent przenies = new Intent(Lista.this, MapsActivity.class);
                startActivity(przenies);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        init();
    }
}
