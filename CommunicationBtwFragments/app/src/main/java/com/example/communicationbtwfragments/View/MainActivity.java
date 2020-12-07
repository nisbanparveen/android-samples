package com.example.communicationbtwfragments.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.communicationbtwfragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentA fragment = new FragmentA();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
}