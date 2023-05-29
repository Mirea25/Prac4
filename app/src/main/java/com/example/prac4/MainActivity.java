package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replaceFragments(fragment2 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, inst).commit();
    }
    public void replaceFragments(fragment3 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, inst).commit();
    }
}