package com.sasvi.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String args[]) {
		String name = "ravindra";
		
	    printCharactersCount(name);
	    
	   	
	}

	/**
	 * Reads characters from input string and sets count in the map
	 * @param name
	 * @param characterCountMap
	 */
	private static void printCharactersCount(String name) {
		Map<Character, Integer> characterCountMap = new LinkedHashMap<Character, Integer>();
		
		// Prepare map with character as key and occurances as integer
		for(int i =0; i< name.length(); i++) {
			Character letter = name.charAt(i);
			if(characterCountMap.get(letter) == null) {
				characterCountMap.put(letter, 1);
			} else {
				int currentCount = characterCountMap.get(letter);
				characterCountMap.put(letter, currentCount+1);
			}
		}
		
		// print values in the map
		for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
			System.out.println("key = "+ entry.getKey());
			System.out.println("Value = "+ entry.getValue());
			
		}
		
	}

	
}	







