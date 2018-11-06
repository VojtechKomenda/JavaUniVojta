package lekce3;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produkt banan = new Produkt(5, "ahoj", 38, "kg", 86) ;
		
		String bananaInfo=banan.printInfo();
		
		int amountofBananas=5;
				
		float totalPrice=banan.countTotalPrice(amountofBananas);
		System.out.println(amountofBananas);
				
		Produkt plenky = new Produkt(38, "plenky",22,"35",38f );
		
		System.out.println ("Plenky maji ID:" + plenky.id + "jmenuje se " + plenky.name);
		
		plenky.printInforAboutTotalPrice(10);
		
		
		
				

	}

}
