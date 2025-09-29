package com.example.francis;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Object getSupportFragmentManager;
         SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager()
                 .findFragmentById(R.id.map);
         if (mapFragment !=null) {
             mapFragment.getMapAsync (this);
         }

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng davao = new LatLng(7.0647,125.6088);
        mMap.addMarker(new MarkerOptions().position(davao).title("mark in davao"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(davao, 12));


    }
}