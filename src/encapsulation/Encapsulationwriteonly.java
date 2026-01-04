package encapsulation;


class roomrent{
	
	private int rent;

	public void setRent(int rent) {
		this.rent = rent;
		System.out.println(rent);
	}
	
}

public class Encapsulationwriteonly {

	public static void main(String[] args) {
		roomrent obj= new roomrent();
		obj.setRent(8000);
	

	}

}
