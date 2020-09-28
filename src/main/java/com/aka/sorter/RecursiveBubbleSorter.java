package com.aka.sorter;

import org.springframework.stereotype.Component;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

@Component
public class RecursiveBubbleSorter implements Sorter {

    @Override
    public void sort(int[] data) {
        recursiveSort(data, data.length - 1);
    }

    private void recursiveSort(int[] data, int fromIndex) {
        if (fromIndex > 1) {
            recursiveSort(data, fromIndex - 1);
        }

        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] > data[i]) {
                int tmp = data[i - 1];
                data[i - 1] = data[i];
                data[i] = tmp;
            }
        }
    }
}
