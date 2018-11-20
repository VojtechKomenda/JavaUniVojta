package lekce5;

import java.util.ArrayList;
import java.util.List;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> animals = new ArrayList<>();
		animals.add("kocka");
		animals.add("had");
		animals.add("pes");
		animals.add("kralik");

		
//		ZooList zooList = new ZooList(animals);
		
		ZooList zooList = new ZooList(animals);
		
		animals=zooList.findShorterThan5();
				
		zooList.printList(animals);
			
		 
		
	}

	
	
	
	
}
