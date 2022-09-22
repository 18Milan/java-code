
public class father
 {
	

void relation1()

{

System.out.println("Son");

}
	
	

}
 public class Mother extends father
 {

	
void relation1()
	
{
	    
super.relation1();
		
System.out.println(" 1child");

}

} 
public class Son extends Mother
{
	
	
void relation2()
	
{   
		
System.out.println("brother");

}

class Inheritancetypes
public static void main(String args[])

{
Son s=new Son();
s.relation1();
s.relation2();
}
}