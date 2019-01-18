package classNobject;

public class TestHouse {

	public static void main(String[] args) {

		House myHouse = new House();

		myHouse.numberOfBedRoom();
		String houseName = myHouse.getHouseName();
		System.out.println(houseName);

		Office myOffice = new Office();
		myOffice.displayofficeadderss();

	}

}
