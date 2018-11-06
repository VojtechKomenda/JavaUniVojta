package lekce3;

public class Account {

int accNumber;
Klient Owner;
int Type;
int balance; 

public Account(int accNumber, Klient Owner, int Type, int balance ) {
	// TODO Auto-generated constructor stub
	this.accNumber=accNumber ;
	this.Owner=Owner;
	this.Type=Type;
	this.balance=0;}
	


	int balanceAdd (int surplus) {
	this.balance=this.balance+surplus;
	return this.balance;
}
	int balanceRemove (int remove) {
		this.balance=this.balance-remove;
		return this.balance;
	}
	

	
void printBalance (){
	System.out.println("Ucet cislo"+ this.accNumber + ",ktery patri "+this.Owner.jmeno + this.Owner.prijmeni + "ma zustatek" + this.balance);
}
}