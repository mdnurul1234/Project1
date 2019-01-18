package constructor;

public class House {
	
	public int houseNumber;
	public  String houseName;
	
	public House() {}
	
	public House(String houseName) {
		
		this.houseName = houseName;
		
		System.out.println(houseName);
	
	
	}
	
	public String getHouseName() {
		return houseName;
		
	}

	public void numberOfBedRoom() {
		System.out.println("There are 3 bed room");
	}
}
