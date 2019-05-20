package com.example.brashi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista extends Activity {

    public Button mapaOdnosnik;
    private ListView list ;
//    private ArrayAdapter<String> adapter ;
    ArrayList<Dzielo> dataModels;
    ListView listView;
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


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

//        list = (ListView) findViewById(R.id.listView1);

//        String cars[] = {"Mercedes", "Fiat", "Ferrari", "Aston Martin", "Lamborghini", "Skoda", "Volkswagen", "Audi", "Citroen"};
//
//        ArrayList<String> carL = new ArrayList<String>();
//        carL.addAll( Arrays.asList(cars) );
//
//        adapter = new ArrayAdapter<String>(this, R.layout.list_row, carL);
//
//        list.setAdapter(adapter);

        listView=(ListView)findViewById(R.id.listView1);

        dataModels= new ArrayList<>();

        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));
        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));
        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));
        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));
        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));
        dataModels.add(new Dzielo("Dzielo 1", "Sławomir Lewandowski", "September 23, 2008"));
        dataModels.add(new Dzielo("Dzielo 2", "Mateusz Kopeć", "February 9, 2009"));
        dataModels.add(new Dzielo("Dzielo 3", "Stanisław Jajor", "April 27, 2009"));

        adapter = new CustomListAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);

        init();
    }
}
