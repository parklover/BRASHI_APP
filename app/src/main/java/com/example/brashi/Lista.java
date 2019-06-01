package com.example.brashi;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Lista extends Activity {

    public Button mapaOdnosnik;
    public Button profilOdnosnik;
    private ListView list ;
    //private ArrayAdapter<String> adapter ;
    ArrayList<Dzielo> dziela;
    ListView listView;
    private DatabaseReference Database;
    private FirebaseDatabase firebase;
    private static CustomListAdapter adapter;

    public void init(){
        mapaOdnosnik = (Button)findViewById(R.id.buttonMapa);
        mapaOdnosnik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent przenies = new Intent(Lista.this, MapsActivity.class);
                startActivity(przenies);
            }
        });

        profilOdnosnik = (Button)findViewById(R.id.button4);
        profilOdnosnik.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent przenies = new Intent(Lista.this, DzieloAddFormActivity.class);
                startActivity(przenies);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        firebase = FirebaseDatabase.getInstance();
        Database = firebase.getReference("Dziela");

        dziela = new ArrayList<>();

        adapter = new CustomListAdapter(dziela, this);

        listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);

        Database.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Dzielo noweDzielo = dataSnapshot.getValue(Dzielo.class);
                dziela.add(noweDzielo);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        init();
    }
}
