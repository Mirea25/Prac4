package com.example.prac4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        Button firsttosecond = view.findViewById(R.id.frag2);
        Button firsttothird = view.findViewById(R.id.frag3);

        firsttosecond.setOnClickListener(new View.OnClickListener() {
            fragment2 fragment2 = new fragment2();
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragments(fragment2);
            }
        });
        firsttothird.setOnClickListener(new View.OnClickListener() {
            fragment3 fragment3 = new fragment3();
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragments(fragment3);
            }
        });
        return view;
    }
}