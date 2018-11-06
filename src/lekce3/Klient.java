package lekce3;

public class Klient {

String jmeno;
String prijmeni;
int ID;
int rc; 
int sex;

public Klient(String jmeno, String prijmeni, int ID, int rc ) {
	// TODO Auto-generated constructor stub
	this.jmeno=jmeno;
	this.prijmeni=prijmeni;
	this.ID=ID;
	this.rc=rc;
	this.sex=sex;
}

String clientChangeName (String nove_jmeno) {
	this.jmeno=nove_jmeno;
	return nove_jmeno;
}
void printID (){
	System.out.println(this.jmeno + " "+ this.prijmeni + " ma ID:" + this.ID );
}
	
int sexChange(int newSex) {
	this.sex=newSex;
	
	this.rc= this.rc + 50000000;
	return newSex;
	
}
	




}
