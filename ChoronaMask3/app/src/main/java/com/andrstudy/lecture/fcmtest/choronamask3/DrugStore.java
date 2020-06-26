package com.andrstudy.lecture.fcmtest.choronamask3;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.andrstudy.lecture.fcmtest.choronamask3.databinding.DrugstoreBinding;

import net.daum.android.map.MapViewEventListener;
import net.daum.mf.map.api.MapView;

public class DrugStore extends AppCompatActivity {
    private DrugstoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DrugstoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MapView mapView = new MapView(this);
        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.Drug_map_View);
//        mapViewContainer.addView(mapView);
//        mapView.setMapViewEventListener((MapViewEventListener) this);
//        mapView.setPOIItemEventListener((MapView.POIItemEventListener) this);
    }

}
