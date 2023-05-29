package com.example.prac4;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class fragment2 extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 200; i++){
            itemList.add(new Item(R.drawable.ic_launcher_foreground, "Test" +i));
        }

        ListView LV = view.findViewById(R.id.itemList);
        CustomAdapter adapter = new CustomAdapter(getContext(),R.layout.custom, itemList);
        LV.setAdapter(adapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(),((TextView) view.findViewById(R.id.CustomTextView)).getText(),
                        Toast.LENGTH_SHORT).show();
                Log.d("ListView", (String) ((TextView) view.findViewById(R.id.CustomTextView)).getText());
            }
        });
        return view;
    }
}