package com.xeniac.quicksort.dataProviders;

import com.xeniac.quicksort.models.DataItemMain;

import java.util.ArrayList;
import java.util.List;

public class MainDataProvider {

    public static List<DataItemMain> dataItemMainList;

    static {
        dataItemMainList = new ArrayList<>();

        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(2));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(22));
        dataItemMainList.add(new DataItemMain(222));
        dataItemMainList.add(new DataItemMain(222));
        dataItemMainList.add(new DataItemMain(222));
        dataItemMainList.add(new DataItemMain(222));
        dataItemMainList.add(new DataItemMain(222));
        dataItemMainList.add(new DataItemMain(2222));
        dataItemMainList.add(new DataItemMain(2222));
        dataItemMainList.add(new DataItemMain(2222));
        dataItemMainList.add(new DataItemMain(2222));
        dataItemMainList.add(new DataItemMain(2222));
        dataItemMainList.add(new DataItemMain(2222));
    }

    private static void addItem(DataItemMain item) {
        dataItemMainList.add(item);
    }
}
