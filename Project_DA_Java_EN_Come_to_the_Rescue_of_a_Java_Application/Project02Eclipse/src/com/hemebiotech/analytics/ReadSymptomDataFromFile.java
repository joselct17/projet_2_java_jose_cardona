package com.hemebiotech.analytics;


import java.io.*;
import java.util.ArrayList;

/**
 * Simple brute force implementation
 *
 */

public class ReadSymptomDataFromFile implements ISymptomReader {



	private String filepath;
	
	/**
	 * 
	 * @param path a full or partial path to file with symptom strings in it, one per line
	 * @return an Array list width all symptoms one per line
	 */
	public ReadSymptomDataFromFile (String path) {
		this.filepath = path;
	}


	@Override
	public ArrayList<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {

				BufferedReader reader = new BufferedReader( new FileReader(filepath));

				String line = reader.readLine();
				
				while (line != null) {
					if ( !line.isBlank()) {
						result.add(line);
					}
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}



}
