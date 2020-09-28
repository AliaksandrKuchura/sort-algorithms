package com.aka.sorter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Aliaksandr Kuchura on Sep, 2020
 */

class RecursiveBubbleSorterTest {

    @Test
    void sort() {
        int[] data = DataDef.getInitData();
        RecursiveBubbleSorter sorter = new RecursiveBubbleSorter();
        sorter.sort(data);

        assertArrayEquals(DataDef.SORTED_DATA, data);
    }
}
