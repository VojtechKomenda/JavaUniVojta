package lekce5;

public class BirthNumber {
	String BNumber; 
	
	

	public BirthNumber (String BNumber) {
			this.BNumber=BNumber;
			}
		
		
		
		
		
	public Boolean IsValid () {
		   Boolean result = false; 
		   
		   result = this.IsValidLeght( )& this.IsValidStructure() & this.IsValid11Divison();
		   
		   return result;   
	   } 	
		
   
   
   
   private Boolean IsValidLeght() {
	   Boolean result=false;
	   
	   if (this.Year()<=53 & this.HasDevider()){	   
		   if (this.BNumber.length()==10)  {
			   result=true;}
		}
	   
	   if (this.Year()> 53 & this.HasDevider()){	   
		   if (this.BNumber.length()==11)  {
			   result=true;}
		}
	   
	   if (this.Year()<= 53 &  !this.HasDevider()){	   
		   if (this.BNumber.length()==9)  {
			   result=true;}
		}
	   
	   if (this.Year()> 53 &  !this.HasDevider()){	   
		   if (this.BNumber.length()==10)  {
			   result=true;}
	   }  
		   
	 return result;  
   }
   
   private Boolean IsValidStructure() {
	   
	   Boolean result=false;
	  
	   	   
	   String BirthNumberSplited[]= new String [3];
	   BirthNumberSplited= this.BirthNumberSplit(); 
	      
	   result=
   			BirthNumberSplited[0].length()==6
   			|
      		(BirthNumberSplited[0].indexOf(3)==0
      		|
      		BirthNumberSplited[0].indexOf(3)==1
      		|
		    BirthNumberSplited[0].indexOf(3)==5
		    |
		    BirthNumberSplited[0].indexOf(3)==6);  	   					   
	 return result;
   }

	private Boolean IsValid11Divison (){
		   int i;
		   long power=1;
		   
		   long Rest;
		   
		   
		   Boolean result=false;	   	   	   
		   String BirthNumberSplited[]= new String [3]; /*naco je toto? Premennu BirthNumberSplited nikde nepouzivas*/
		   BirthNumberSplited= this.BirthNumberSplit();
		   String BirthNumberWithoutDevider=this.BirthNumberWithoutDevider();
		   long BirthNumber=0;
		   	  
		   for (i=BirthNumberWithoutDevider.length()-1; i>=0 ;i--)
		   {
			   
			   BirthNumber=BirthNumber + Integer.parseInt(Character.toString(BirthNumberWithoutDevider.charAt(i)))*power;
			   power=power * 10;		   
		   }   
			   
		   
		   Rest=BirthNumber%11;
		   
		   if (Rest==0) {
				   result=true;}		   
			  	   					   
		 return result;
	   }

   
   
   
   
   
   private String[] BirthNumberSplit() {
	   String BirthNumberSplited[]= new String [3];
	    
	   if (this.HasDevider()) {
		BirthNumberSplited = this.BNumber.split("/");	   
	   }	   
	   else {
		   BirthNumberSplited[0] = this.BNumber.substring(0,6);
		   BirthNumberSplited[1] = this.BNumber.substring(6);
	   		}
		   
	 return BirthNumberSplited;
   }
   
   
   
   private Boolean HasDevider() {
	   boolean HasDevider; 
   	   
	   HasDevider = this.BNumber.contains("/");
	   
	   return HasDevider;
   } 
   
   private int Year() {
	    int BirthNumberYear;
   	   	char aa=this.BNumber.charAt(0); /*naco je toto? nikde to nepouzivas*/

	    BirthNumberYear = Integer.parseInt(Character.toString(this.BNumber.charAt(0)))*10 +Integer.parseInt(Character.toString(this.BNumber.charAt(1)));
	    
	   return BirthNumberYear;
   }
   
   
   private String BirthNumberWithoutDevider() {	 
	   String BirthNumberSplited[]= new String [3];
	   BirthNumberSplited= this.BirthNumberSplit();
	   
	   
	   return BirthNumberSplited[0]+BirthNumberSplited[1];	   	   	   
   }
 }
