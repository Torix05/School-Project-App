package com.codesample.choronamask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codesample.choronamask.databinding.ActivityMedicalClinicBinding;

public class MedicalClinic extends AppCompatActivity {
    private ActivityMedicalClinicBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMedicalClinicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
