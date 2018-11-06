package lekce2;

import java.io.IOException;

public class GAME {
	
	public static void main(String[] args) throws IOException{
		char answer='k';


System.out.println("Press key and then enter:");
 
char keyboardEntry = (char) System.in.read();
System.out.println (keyboardEntry);

if (keyboardEntry==answer)	
{System.out.println("Spravne");}
else
{System.out.println("Spatne");}

;


}
}


