class CityInquiry
      {
  void Area(int pincode)
{
		System.out.println(pincode);
	}

	void Area(int pincode, String police_s) {
		System.out.println(pincode);
		System.out.println(police_s);
	}

	void Area(int pincode, String police_s, String city) {
		System.out.println(pincode);
		System.out.println(police_s);
		System.out.println(city);
	}	

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("How many data you want to enter: ");
		int num_data = scan.nextInt();

		CityInquiry p =  new CityInquiry();

		switch(num_data) {
			case 1:
				p.Area(421102);
				break;
			case 2:
				p.Area(421102, "Ambivali");
				break;
			case 3:
				p.Area(421102, "Ambivali", "Kalyan");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}