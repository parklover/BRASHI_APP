package com.example.brashi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class DzieloAddFormActivity extends AppCompatActivity {

    public Button listaOdnosnik;
    public Button mapaOdnosnik;
    public Button zapisz;
    private String dzieloId;
    private DatabaseReference Database;
    private FirebaseDatabase firebase;
    EditText nazwa, opis;

    public void init(){
        listaOdnosnik = (Button)findViewById(R.id.buttonLista);
        listaOdnosnik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent przenies = new Intent(DzieloAddFormActivity.this, Lista.class);
                startActivity(przenies);
            }
        });

        mapaOdnosnik = (Button)findViewById(R.id.buttonMapa);
        mapaOdnosnik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent przenies = new Intent(DzieloAddFormActivity.this, MapsActivity.class);
                startActivity(przenies);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzielo_add_form);

        firebase = FirebaseDatabase.getInstance();
        Database = firebase.getReference("Dziela");

        nazwa = (EditText)findViewById(R.id.nazwa);
        opis = (EditText)findViewById(R.id.opis);

        zapisz = (Button)findViewById(R.id.zapisz);
        zapisz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Date teraz = new Date();
                Dzielo noweDzielo = new Dzielo(nazwa.getText().toString().trim(), 52.416520, 16.980050, opis.getText().toString().trim(), teraz, teraz, false, false);
                Database.push().setValue(noweDzielo);
                Toast.makeText(DzieloAddFormActivity.this, "Dodano do bazy", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
