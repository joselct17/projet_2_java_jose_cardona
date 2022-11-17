package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {

	/**
	 * @param args symptoms.txt, result.out
	 * @throws Exception
	 */

	
	public static void main(String args[]) throws Exception {

		analyticsCounter();

	}

	public static void analyticsCounter () throws IOException {
		InputStreamReader inputReader = new InputStreamReader(System.in);

		BufferedReader pathReader = new BufferedReader(inputReader);

		System.out.println("Give me your input file");

		String inputFile = pathReader.readLine();

		//Call obj readSymptom
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile(inputFile);

		//Call obj symptoms
		ArrayList<String> symptoms = readSymptom.getSymptoms();

		// Counting the frequencies

		CountDataFrequencies countSymptoms= new CountDataFrequencies();

		Map<String, Integer> treeMap = countSymptoms.countFrequencies(symptoms);

		// Writing in the file

		System.out.println("Give me your output file");

		String outputFile = pathReader.readLine();
		WriteSymptomDataToFile writeSymptoms = new WriteSymptomDataToFile(outputFile);

		writeSymptoms.writeData(treeMap);
	}

	}

