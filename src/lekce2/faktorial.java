package lekce2;

public class faktorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cislo;
int zaklad=5;
int faktorial=1;
	

for (cislo=zaklad; cislo>=1;cislo-- ){
		faktorial=faktorial*cislo;
		
		
	}
	
System.out.println("Faktorial cisla " + zaklad + " je " + faktorial );	
	
	
	
	}

}
