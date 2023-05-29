package com.example.prac4;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragment3 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 200; i++){
            itemList.add(new Item(R.drawable.ic_launcher_foreground, "Test" +i));
        }
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        CustomRecycleAdapter customRecycleAdapter = new CustomRecycleAdapter(getContext(),itemList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(customRecycleAdapter);
        return view;
    }
}