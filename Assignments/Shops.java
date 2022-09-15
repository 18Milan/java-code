class Shop
{
	String name;
	String location;	
	int contact;
	String type;
	
	
	void shopLocation(String m,String n)
	{
	name=m;
	location=n;
	System.out.println(name +"  " + "shop is in" + "  " +location);
	}

	void shopAddress(String a,String b)
	{
	name=a;
	location=b;
	
	System.out.println(name +"  " + "shop is in"+ "  " +location + "  " + "location" + "  " +"contact no. is" +" "+ contact);
	}

        void shopInfo(String x,String y)
	{
	name=x;
	type=y;
	System.out.println(y +" " + x + " " +"shop is located in" +"  "+location +"  " + " contact no. is" + "  " +contact);
	}
	
	

  public static void main(String[] args) 
  {
  shop s1 = new shop();
  s1.shopLocation("Bhakti","shivaji nagar");
  
  shop s2 = new shop();
  s2.contact=5864721;
  s2.shopAddress("pooja","near  govind  palza");
  
  shop s3 = new shop();
  s3.location="vadavali section";
  s3.shopInfo("sneha","Groecry");
  
  }
}