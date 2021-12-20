package homework_04;

public class Card {
	private String num;
	private String equal;
	
	 

	public static void main(String[] args){
		Card newCard = new Card("4D");
		System.out.println(newCard.getDescription());}



	public Card(int num, String equal)
	{
	if (equal == "A") 
	  { 
	     this.equal = " of Ace"; 
	  } 
	else if (equal == "J") 
	   { 
	     this.equal = "of Jack"; 
	   } 
	else if (equal == "Q") 
	   { 
	     this.equal = "of Queen"; 
	   } 
	else if (equal == "K") 
	   { 
	      this.equal = "of King"; 
	   } 


	else if (equal == "D") 
	  { 
	     this.equal = "of Diamonds"; 
	  } 
	else if (equal == "H") 
	   { 
	     this.equal = "of Hearts"; 
	   } 
	else if (equal == "S") 
	   { 
	     this.equal = "of Spades"; 
	   } 
	else if (equal == "c") 
	   { 
	      this.equal = "of Clubs"; 
	   } 


	else 
	   {  
	     this.equal = "Unknown ";  
	   }  
	if (num == 2)  
	   {  
	    this.num = "Two ";  


	   }  


	else if (num == 3)  
	   {  
	    this.num = "Three ";  


	   }  


	else if (num == 4)  
	   {  
	    this.num = "Four ";  


	   }  
	else if (num == 5)  
	   {  
	    this.num = "Five ";  

	   }  
	else if (num == 6)  
	   {  
	    this.num = "Six";  


	   }  
	else if (num == 7)  
	   {  
	    this.num = "Seven ";  


	   }  
	else 
	   {  
	     this.equal = "Unknown ";  
	    }   
	 


	}
	      
	public String getDescription()
	   { 
	       return this.num + this.equal; 
	    }  
}



	
