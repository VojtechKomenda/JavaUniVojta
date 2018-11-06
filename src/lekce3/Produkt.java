package lekce3;

public class Produkt {

	int id;
	String name;
	int volume;
	String volumeUnit;
	float price;
	
  Produkt(){
		id=10;
  		}

	public Produkt(int id, String name, int volume, String volumeUnit, float price) {
		super();
		this.id = id;
		this.name = name;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.price = price;
		}
	
	String printInfo() {
		return "Muj vyrobek je" + this.name + "a má id: " + this.id;
	}	
	float countTotalPrice(int amount) {
		return this.price*amount;
	}
	
	void printInforAboutTotalPrice (float ammount) {
		float cena=this.price;
		float celkova_cena=ammount * cena;
		System.out.println(""+celkova_cena);
		
		
				
				
		
		
		
	}
	
		
		
	
	
}
