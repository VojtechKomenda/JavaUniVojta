package lekce2;

public class pyramida3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String radek="";
int max=9;
int rad=1;
int i=1;
int j=1;

	for (rad=1;rad<=max; rad++) {
		for(j=1; j<=rad; j++) {
		radek=radek+ "*";
		}
			for (i=1;i<=(max-rad)/2; i++) {
				radek= " "+radek;
			}
			
			for (i=1;i<=(max-rad)/2; i++) {
				radek= radek+ " ";
			}
			System.out.println(radek);
			radek="";
			
			}
		
		
	} 
	
	
	
	}


