package lekce5;

import java.util.ArrayList;
import java.util.List;

public class ZooList {

	List<String> listName;

	public ZooList(List<String> listName) {
		super();
		this.listName = listName;
	}


	public List<String> findShorterThan5() {
		List<String> shorterThan5 = new ArrayList<>();
		
		for (String word : this.listName){
			if (word.length()<5 ) {
				shorterThan5.add(word);
			}
		}
		return shorterThan5;
	}
	
	public void printList (List<String> listOfShortWords ) {
		for (String s: listOfShortWords) {
			System.out.println(s);			
		}		
	}	
}
