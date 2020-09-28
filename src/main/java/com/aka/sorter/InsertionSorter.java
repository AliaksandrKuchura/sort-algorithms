package com.aka.sorter;

import java.util.Arrays;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

public class InsertionSorter implements Sorter {
    @Override
    public void sort(int[] data) {
        int length = data.length;

        for (int i = 1; i < length; i++) {
            int value = data[i];
            int pos = i - 1;

            while (pos >= 0 && value < data[pos]) {
                data[pos + 1] = data[pos];
                pos--;
            }
            data[pos + 1] = value;
        }
    }
}
