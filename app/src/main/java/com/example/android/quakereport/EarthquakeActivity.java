package com.example.android.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Earthquake>  earthquake= new ArrayList<>();
        earthquake.add(new Earthquake("7.2","San Francisco","feb 2, 2016"));
        earthquake.add(new Earthquake("6.1","London","july 20, 2016"));
        earthquake.add(new Earthquake("3.9","Tokyo","August 21, 2016"));
        earthquake.add(new Earthquake("5.4","Mexico city","September 2, 2017"));
        earthquake.add(new Earthquake("2.8","Moscow","October 3, 2017"));



        EarthquakeAdapter adapter=new EarthquakeAdapter(this,earthquake);

        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}