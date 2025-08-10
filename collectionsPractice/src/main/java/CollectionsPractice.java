package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class CollectionsPractice {

	//shuffle elements in arraylist
	public String shuffleElements() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		
		System.out.println("Original list: "+list);
		Collections.shuffle(list);
		return("Shuffled list: "+list);
	}
	
	//extract a portion of an arraylist
	public String extractPortion() {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Original list: "+list);
		return("Extracted portion of list:"+list.subList(1, 4));		
	}
	
	//replace second element of arraylist
	public String replaceElement() {
			
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("banana");
		
		System.out.println("Original list: "+list);
		list.set(1, "pineapple");
		return("List after replacing 2nd element: "+list);
	}
	
	//clone a hash set
	public String cloneHashSet() {
		
		HashSet<String> set = new HashSet<>();
		set.add("Kevin");
		set.add("John");
		set.add("Mike");
		
		System.out.println("Original set: "+set);
		HashSet<String> clonedSet = (HashSet<String>) set.clone();
		clonedSet.add("Charlie");
		return ("Cloned hashset: "+clonedSet);
	}
	
	//convert hashset to treeset
	public String convertToTreeSet() {
		
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(5);
		hashset.add(4);
		hashset.add(3);
		hashset.add(2);
		hashset.add(1);
		System.out.println("Hashset: "+hashset);
		
		TreeSet<Integer> treeset = new TreeSet<>(hashset);
		return("Treeset: "+treeset);
	}
	
	//collection view of keys on map
	public void viewKeys() {
		HashMap<String,String> map = new HashMap<>();
		map.put("name", "Lucy");
		map.put("age", "7");
		System.out.print("Keys: ");
		for(String key : map.keySet()) {
			System.out.print(key+" "); 
		}
		
	}
	
}
