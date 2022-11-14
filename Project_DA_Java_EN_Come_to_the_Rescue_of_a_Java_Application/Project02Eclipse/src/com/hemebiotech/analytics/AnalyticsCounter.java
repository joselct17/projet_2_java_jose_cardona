package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {

	/**
	 * @param args symptoms.txt, result.out
	 * @throws Exception
	 */

	
	public static void main(String args[]) throws Exception {

			//symptoms.txt
			String symptomsFile = args[0];

			//result.out
			String resultFile = args[1];


			//Call obj readSymptom
			ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(symptomsFile);

			//Call obj symptoms
			ArrayList<String> symptoms = readSymptom.getSymptoms();

			// Counting the frequencies

			CountDataFrequencies countSymptoms= new CountDataFrequencies();

			Map<String, Integer> treeMap = countSymptoms.countFrequencies(symptoms);

			// Writing in the file
			WriteSymptomDataToFile writeSymptoms = new WriteSymptomDataToFile(resultFile);

			writeSymptoms.writeData(treeMap);

		}

	}

