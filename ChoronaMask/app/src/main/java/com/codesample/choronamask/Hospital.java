package com.codesample.choronamask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.choronamask.databinding.ActivityHospitalBinding;

public class Hospital extends AppCompatActivity {
    private ActivityHospitalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHospitalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
