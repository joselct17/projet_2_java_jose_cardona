package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CountDataFrequencies {

    /**
     *
     * @param symptoms an Array list with symptoms
     * @return Count the symptom's frequencies
     */

    public Map<String, Integer> countFrequencies(ArrayList<String> symptoms) {

        // treeMap to store the frequency of elements in alphabetical order
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

        //Iteration in list symptoms

        if (symptoms != null) {
            for (String i : symptoms) {
                Integer j = treeMap.get(i);
                treeMap.put(i, (j == null) ? 1 : j + 1);
            }
        }

        return treeMap;
    }
}
