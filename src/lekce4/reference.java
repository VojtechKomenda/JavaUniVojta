package lekce4;

public class reference {

	public void demonstrateObjectReference() {
	int i;
	int nums1[]=new int [10];
	int nums2[]=new int [10];
	
	for (i=0; i<10; i++) 
	nums1[i]=i;
	
	for (i=0; i<10; i++) 
		nums2[i]=-i;
	
	System.out.print("Here is nums1:");
	printArray(nums1);
	
	System.out.print("Here is nums2:");
	printArray(nums2);
	
	nums2=nums1;
	
	System.out.print("Here is nums2 after assigment:");
	printArray(nums2);
	
	nums2[3]=99;
	
	System.out.print("Here is nums1 after change through nums2:");
	printArray(nums1);
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

	private void printArray(int[] nums1) {
		int i;
		for (i=0; i<10; i++) 
			System.out.print(nums1[i]+ " ");
		System.out.println();
	}
	
}
