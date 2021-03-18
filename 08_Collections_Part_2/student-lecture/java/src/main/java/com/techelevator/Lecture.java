package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		
		Map<Integer, String> students = new HashMap <Integer, String>();
		students.put(1, "Zoe");
		
		
		// creates a map with <K,V> <String, String>
		Map<String, String> dailySpecials = new HashMap <String, String>();
		// adding items to the map
		dailySpecials.put("Monday", "Waffles");
		dailySpecials.put("Tuesday", "Pancakes");
		dailySpecials.put("Wednesday", "French Toast");
		dailySpecials.put("Thursday", "Liver");
		dailySpecials.put("Friday", "Sausage and Eggs");
		dailySpecials.put("Saturday", "Waffles");
		dailySpecials.put("Sunday", "Butter Toast");
		
		
		// to get the daily special for Tuesday
		String tuesdaySpecial = dailySpecials.get("Tuesday");
		
		// to print out Tuesdays special
		
		System.out.println("Tuesday's Special: " + tuesdaySpecial);
	
		//to change the value at a key
		dailySpecials.put("Monday", "Liver");
		
		String mondaySpecial = dailySpecials.get("Monday");
		System.out.println("Monday's Special: " + mondaySpecial);	
		
		//for(int i = 0; i < dailySpecials.size(); i ++)
		{
			//dailySpecials.get(i);
		}
		// don't do this
		
		// the keys of a map are a set
		// we can use the keySet function to get all the keys
		
		// Option 1 to loop through all the values 
		// - get the keys
		// -- loop through the keys
		// --- get the values
		Set<String> keys = dailySpecials.keySet();		
		
		for(String key : keys)
		{
			String special = dailySpecials.get(key);
			System.out.println(key + " : " + special);
		}
	
	
		// Map<K,V>;
		// Option 2
		// -- loop through each ROW
		// --- get the key and value from each ROW
		
		List<String> names = new ArrayList<String>();
		names.add("Joe");
		
		// traditional loop
		for(int i = 0; i < names.size(); i ++)
		{
			
			String currentName = names.get(i);
			//System.out.println(currentName);
		}
		
		// foreach loop
		for(String currentName: names)
		{
		//	System.out.println(currentName);
		}
		
		// to loop through a map 
		// use foreach loop
		// because no access to the position
		
		for(Map.Entry<String, String> row : dailySpecials.entrySet())
		{
			System.out.println(row.getKey() + " : " + row.getValue());
		}
		
		// to remove some objects
		dailySpecials.remove("Monday");
		
		System.out.println();
		
		
		dailySpecials.put("Sunday", " and Waffles"); // states and waffles for Sunday not right
		
		//take the specials and add something to it
		// I need to get the current value
		// and append my new value
		// and then put it back in the map
		
		String sundaySpecial = dailySpecials.get("Sunday");
		dailySpecials.put("Sunday", sundaySpecial +  "and Waffles");
		
	
	}
	

}
