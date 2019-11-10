package com.xeniac.quicksort.dataProviders;

import com.xeniac.quicksort.models.DataItemMain;

import java.util.ArrayList;
import java.util.List;

public class MainDataProvider {

    public static List<DataItemMain> dataItemMainList;

    static {
        dataItemMainList = new ArrayList<>();

    }

    private static void addItem(DataItemMain item) {
        dataItemMainList.add(item);
    }
}
