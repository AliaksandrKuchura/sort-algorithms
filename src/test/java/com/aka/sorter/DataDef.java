package com.aka.sorter;

import java.util.Arrays;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

class DataDef {

    private static final int[] INITIAL_DATA = new int[]{6, 8, 2, 1, 5, 4, 7, 3, 9, 0};

    static final int[] SORTED_DATA = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int[] getInitData() {
        return Arrays.copyOf(INITIAL_DATA,INITIAL_DATA.length);
    }
}
