package lekce2;

public class ISprimeNumbers {

	public static void main(String[] args) 
	{
			
			// TODO Auto-generated method stub
			
			int cislo=21;
			int ukazatel;
			boolean jinyDelenec = false;
			int zbytek;
			int suma=0;

			
					for (ukazatel=cislo; ukazatel >=1;ukazatel--)
							{zbytek=(cislo%ukazatel);
								if (( zbytek == 0)&(cislo!=ukazatel))
									{if ((ukazatel == 1)&(jinyDelenec==false))
									  {System.out.println(cislo + " je prvocislo");}
									  else
									  {System.out.println(cislo + " není prvocislo");}
									  
									  jinyDelenec=true;}
							}
					;
		

				}
			
}