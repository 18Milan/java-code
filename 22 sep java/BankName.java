class bank

{ 
 
int getRateOfInterest()

{

return 5;

}  

}  
 

class PNB extends bank

{  
int getRateOfInterest()

{

return 7;

}  

} 
 
class GOP extends bank

{  

int getRateOfInterest()

{

return 9;

} 
 
}
 

class BankName{  

public static void main(String args[])

{  

PNB s=new BOI();
  GOP a=new ICICI(); 
 
System.out.println("PNB Rate of Interest: "+s.getRateOfInterest()); 
 
System.out.println("GOP Rate of Interest: "+a.getRateOfInterest());  
}
  
}