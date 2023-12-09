package com.example.referenx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.referenx.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ContinentFragment())
                .commit();
    }
}
