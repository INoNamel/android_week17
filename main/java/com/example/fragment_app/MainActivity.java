package com.example.fragment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private ListFragment listFragment;
    private DetailFrag detailFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listFragment = ListFragment.newInstance(this);


        detailFrag = DetailFrag.newInstance("!");
        presentFrag(R.id.tabList, listFragment);
        presentFrag(R.id.tabFrag, detailFrag);

    }

    public void handleItemClick(String item) {
        detailFrag = DetailFrag.newInstance(item);
        presentFrag(R.id.tabFrag, detailFrag);
    }

    private void presentFrag(int resourceID, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(resourceID, fragment).commit();
    }
}
