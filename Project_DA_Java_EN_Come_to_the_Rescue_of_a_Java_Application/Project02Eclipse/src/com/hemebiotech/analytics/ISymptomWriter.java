package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * Anything that will write symptom data in an out file
 * The important part is, the return value from the operation, which is a treeMap,
 * that may contain many duplications
 *
 */
public interface ISymptomWriter {
    /**
     *
     * @param treeMap a map with symptoms as key and number of occurrences
     * @return a map with all symptoms one per line
     */


    Map<String, Integer> writeData(Map<String, Integer> treeMap);
}
