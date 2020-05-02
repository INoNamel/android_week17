package com.example.fragment_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailFrag extends Fragment {
    private String value = "";

    public static DetailFrag newInstance(String value) {
        DetailFrag detailFrag = new DetailFrag();
        detailFrag.value = value;
        return detailFrag;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.detaillayout, container, false);
        TextView textView = v.findViewById(R.id.textView);
        textView.setText(value);
        return v;
    }
}
