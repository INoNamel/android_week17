package com.example.fragment_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {
    private MainActivity mainActivity;

    public static ListFragment newInstance(MainActivity mainActivity){
        ListFragment listFragment = new ListFragment();
        listFragment.mainActivity = mainActivity;
        return listFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listlayout, container, false);
        ListView listView = v.findViewById(R.id.tabList);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                if(textView != null) {
                    mainActivity.handleItemClick(textView.getText().toString());
                }
            }
        });

        return v;
    }
}
