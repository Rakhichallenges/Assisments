package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.Exception.Customexception;

public class Utility {

	public static String getHours(Integer hour) throws Customexception {
		Map wordMap = getMap();

		String hourInword = null;
		if (hour >= 24) {
			throw new Customexception("Input hours can not be grater than 24");
		} else {
			if (wordMap.containsKey(hour))
				hourInword = (String) wordMap.get(hour);
		}
		return hourInword;
	}

	public static String getMinute(Integer min) throws Customexception {
		Map wordMap = getMap();
		String minInword = null;
		if (min >= 60) {
			throw new Customexception("Input min can not be grater than 60");
		}
		else {
			if (wordMap.containsKey(min))
				minInword  = (String) wordMap.get(min);
		}
		return minInword ;

	}

	public static String getSecond(Integer sec) throws Customexception {
		Map wordMap = getMap();
		String secInword = null;
		if (sec >= 60) {
			throw new Customexception("Input sec can not be grater than or equal 60");
		}
		else {
			if (wordMap.containsKey(sec))
				secInword = (String) wordMap.get(sec);
		}
		return secInword;

	}

	// This map data is used to convert time in words
	public static Map<Integer, String> getMap() {
		HashMap<Integer, String> word = new HashMap<Integer, String>();
		word.put(1, "One");
		word.put(2, "Two");
		word.put(3, "Three");
		word.put(4, "Four");
		word.put(5, "Five");
		word.put(6, "Six");
		word.put(7, "Seven");
		word.put(8, "Eight");
		word.put(9, "Nine");
		word.put(10, "Ten");
		word.put(11, "Eleven");
		word.put(12, "Twelve");
		return word;
	}
}
