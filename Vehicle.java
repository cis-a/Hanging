public abstract class Vehicle {

	private String brand;
	private int kilometers;

		//Constructor
		    public Vehicle(String brand, int kilometers) {
       			 this.brand = brand;
			 		 	 this.kilometers = kilometers;
		    }

		//Setter
				public void setBrand (String brand) {
				this.brand = brand;
				}

				public void setKilometers (int kilometers) {
				this.brand = brand;
				}

		//Getter
				public String getBrand () {
				return this.brand;
				}

				public int getKilometers () {
				return this.kilometers;
				}

	//Abstract Method: body  to be implemented in subclasses
			public abstract String doStuff ();
}
