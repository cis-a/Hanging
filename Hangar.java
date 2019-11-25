class Hangar {

	public static void main (String [] args) {

		// References to Vehicles
		Car Rover = new Car ("Rover", 105000);
		Boat Dinghy = new Boat ("Dinghy", 200000);

		//Use setter method
		Rover.setKilometers(500);
		Dinghy.setBrand("Dinghy II");
		Dinghy.setKilometers(110000);

			//Call doStuff method
			System.out.println (Rover.doStuff());
			System.out.println (Dinghy.doStuff());
		}
}
