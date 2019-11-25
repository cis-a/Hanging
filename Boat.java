public class Boat extends Vehicle {

		// Constructor
		public Boat (String brand, int kilometers) {
				super (brand, kilometers);
		}
				//implements abstract Method :
		public String doStuff () {
				return ("I am " + this.getBrand() + " and I go glug glug!");
		}
}
