package com.xeniac.quicksort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.xeniac.quicksort.adapters.MainAdapter;
import com.xeniac.quicksort.dataProviders.MainDataProvider;
import com.xeniac.quicksort.models.DataItemMain;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        mainRecyclerView();
    }

    private void mainRecyclerView() {
        MainAdapter mainAdapter = new MainAdapter(this, MainDataProvider.dataItemMainList);
        RecyclerView mainInitialRV = findViewById(R.id.rv_main_initial);
        mainInitialRV.setAdapter(mainAdapter);

        RecyclerView mainSortedRV = findViewById(R.id.rv_main_sorted);
        mainSortedRV.setAdapter(mainAdapter);
    }
}