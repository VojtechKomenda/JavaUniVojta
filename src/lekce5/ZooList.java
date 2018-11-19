package lekce5;

import java.util.ArrayList;

public class ZooList {

	ArrayList<String> listName;

	
	
	public ZooList(ArrayList<String> listName) {
		super();
		this.listName = listName;
	}
	
	
	
	public List<String> findShorterThan5() {
	List<String> shorterThan5= new ArrayList<>();
	for (String word : this.listName){
		if (word.lenght()<5 ) {
			shorterThan5.add(word)
			
		}
	}
	
	return shorterThan5;
	}
	
	
	public void printList (List<String> listOfShortWords ) {
	
		
		
		
	}
	}
	for (String s: animalsShorterThan5) {
	System.out.println();
	
			
	}
	
	
	
	
	
}
