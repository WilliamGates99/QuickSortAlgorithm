package com.xeniac.quicksort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.xeniac.quicksort.adapters.MainAdapter;
import com.xeniac.quicksort.dataProviders.MainDataProvider;
import com.xeniac.quicksort.models.DataItemMain;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText mainET;
    private TextView initialEmptyTV, sortedEmptyTV;

    private RecyclerView initialRV, sortedRV;
    private List<DataItemMain> dataItemMainList = MainDataProvider.dataItemMainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        mainInitializer();
    }

    private void mainInitializer() {
        mainET = findViewById(R.id.ti_main_edit);
        initialEmptyTV = findViewById(R.id.tv_main_initial_empty);
        sortedEmptyTV = findViewById(R.id.tv_main_sorted_empty);

        initialRV = findViewById(R.id.rv_main_initial);
        sortedRV = findViewById(R.id.rv_main_sorted);

        mainCondition();
        editTextActionDone();
    }

    private void mainCondition() {
        if (dataItemMainList.isEmpty()) {
            initialRV.setVisibility(View.GONE);
            sortedRV.setVisibility(View.GONE);

            initialEmptyTV.setVisibility(View.VISIBLE);
            sortedEmptyTV.setVisibility(View.VISIBLE);
        } else {
            initialEmptyTV.setVisibility(View.GONE);
            sortedEmptyTV.setVisibility(View.VISIBLE);

            initialRV.setVisibility(View.VISIBLE);
            sortedRV.setVisibility(View.GONE);

            mainRecyclerView();
        }
    }

    private void mainRecyclerView() {
        MainAdapter initialAdapter = new MainAdapter(this, dataItemMainList);
        initialRV.setAdapter(initialAdapter);
    }

    private void editTextActionDone() {
        mainET.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                addOnClick(v);
            }
            return false;
        });
    }

    public void addOnClick(View view) {
        String input = Objects.requireNonNull(mainET.getText()).toString();

        if (TextUtils.isEmpty(input)) {
            mainET.requestFocus();
            InputMethodManager methodManager =
                    (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (methodManager != null) {
                methodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
            }
        } else {
            InputMethodManager methodManager =
                    (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (methodManager != null) {
                methodManager.hideSoftInputFromWindow(mainET.getWindowToken(), 0);
            }
            mainET.setText(null);
            mainET.clearFocus();

            dataItemMainList.add(new DataItemMain(Integer.parseInt(input)));
            mainCondition();
            sortedEmptyTV.setText(R.string.string_main_sorted_msg);
        }
    }

    public void sortOnClick(View view) {
        sortedEmptyTV.setVisibility(View.GONE);
        sortedRV.setVisibility(View.VISIBLE);

        MainAdapter sortedAdapter = new MainAdapter(this, dataItemMainList);
        sortedRV.setAdapter(sortedAdapter);
    }
}