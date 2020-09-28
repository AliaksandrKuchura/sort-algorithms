package com.aka.sorter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

class InsertionSorterTest {

    @Test
    void sort() {
        int[] data = DataDef.getInitData();
        InsertionSorter sorter = new InsertionSorter();
        sorter.sort(data);

        assertArrayEquals(DataDef.SORTED_DATA, data);
    }
}
