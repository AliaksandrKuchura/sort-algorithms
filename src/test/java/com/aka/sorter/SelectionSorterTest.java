package com.aka.sorter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

class SelectionSorterTest {

    @Test
    void sort() {
        int[] data = DataDef.getInitData();
        SelectionSorter sorter = new SelectionSorter();
        sorter.sort(data);

        assertArrayEquals( DataDef.SORTED_DATA, data);
    }
}
