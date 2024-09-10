package com.minejava.tutorials.algorithms;

import java.util.ArrayList;

public class Summed {

    ArrayList<Integer> arrayList;

    public Summed() {
        this.arrayList = new ArrayList<>();

    }

    private ArrayList<Integer> sorterSum(ArrayList<Integer> initArrayList) {
        int mySize = initArrayList.size();

        // Start by sorting the array or list:
        for(int index = 0; index < mySize; index++) {
            for (int jIndex = mySize - 1; jIndex > index; jIndex-- ) {
                if (initArrayList.get(index) > initArrayList.get(jIndex)) {
                    // Assign the i-th index value to temp
                    int temp = initArrayList.get(index);
                    // Move the j-th value to i-th index
                    initArrayList.set(index, initArrayList.get(jIndex));
                    // Now, set the j-th index with temp value
                    initArrayList.set(jIndex, temp);
                }
            }
        }
        return initArrayList;
    }

    public void printSortedArrayList(ArrayList<Integer> iniIntegers) {
        sorterSum(iniIntegers);
    }

}
