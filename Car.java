public class Car extends Vehicle {

		// Constructor
		public Car (String brand, int kilometers) {
				super (brand, kilometers);
		}
				//implements abstract Method :
		public String doStuff () {
				return ("I am " + this.getBrand() + " and I go zoom zoom zoom!");
		}
}
