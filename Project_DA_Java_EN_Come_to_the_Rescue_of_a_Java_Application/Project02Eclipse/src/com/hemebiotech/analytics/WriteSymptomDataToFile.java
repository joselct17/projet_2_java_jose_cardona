package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

public class WriteSymptomDataToFile implements ISymptomWriter{


    private static String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     * @return  Write a Map with all the symptoms in a file in alphabetical order
     *
     */

    public WriteSymptomDataToFile(String filepath) {this.filepath = filepath;}


    @Override
    public  Map<String, Integer> writeData(Map<String, Integer> treeMap)  {


        // displaying the occurrence of elements in the arraylist
        if (filepath != null ) {

            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filepath))) {

                for (Map.Entry<String, Integer> val : treeMap.entrySet()) {

                    fileWriter.write( val.getKey() + " " + ": " + val.getValue());

                    fileWriter.newLine();
                }
                fileWriter.flush();

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return treeMap;
    }


}
