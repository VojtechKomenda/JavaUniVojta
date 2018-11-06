package lekce2;

public class primeNumbers {

	public static void main(String[] args) 
{
		
		// TODO Auto-generated method stub
		
		int cislo;
		int ukazatel;
		boolean jinyDelenec = false;
		int zbytek;
		int suma=0;

		for (cislo=1;cislo<=100; cislo++)
				{for (ukazatel=cislo; ukazatel >=1;ukazatel--)
						{zbytek=(cislo%ukazatel);
							if (( zbytek == 0)&(cislo!=ukazatel))
								{if ((ukazatel == 1)&(jinyDelenec==false))
								  {System.out.println(cislo);
								  suma=suma+cislo;
								  }
								  jinyDelenec=true;}
						}
				jinyDelenec=false;}
		System.out.println("Soucet je " +suma);

			}
		
	}
