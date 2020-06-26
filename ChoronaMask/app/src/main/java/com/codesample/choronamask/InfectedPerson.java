package com.codesample.choronamask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codesample.choronamask.databinding.ActivityInfectedPersonBinding;

public class InfectedPerson extends AppCompatActivity {
    private ActivityInfectedPersonBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfectedPersonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonAllPerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }


}
