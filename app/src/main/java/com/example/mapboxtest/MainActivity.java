package com.example.mapboxtest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;
import com.mapbox.maps.loader.MapboxMaps;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.annotation.Annotation;


public class MainActivity extends AppCompatActivity {

    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri("mapbox://styles/ke3v/ckzt5hfy3007h15qkbioshf4g");

    }

    @Override
    protected void onStart(){
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop(){
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mapView.onDestroy();
    }
}