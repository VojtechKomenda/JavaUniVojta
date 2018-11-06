package lekce2;

public class deviders {

	public static void main(String[] args) 
{
		
		// TODO Auto-generated method stub
		
		int cislo;
		int ukazatel;		
		int zbytek;
		String deviders;
		
		
		for (cislo=1;cislo<=100; cislo++) {
			deviders="Delitelem cisla " + cislo + " je: " ;
				{for (ukazatel=cislo; ukazatel >=1;ukazatel--)
						{zbytek=(cislo%ukazatel);
							if (( zbytek == 0))
								  {deviders=deviders + ukazatel+" ";}
								  }
						}
				System.out.println(deviders);
				deviders="";
				
				}
}
		
	}
