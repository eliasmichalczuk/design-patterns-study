package builder;

public class Director {
	
	public Director() {}

	public Car makeSUV(Builder builder) {
		builder.setCar(new SUV());
		return builder.withEngine(new SportEngine()).withGPS(new GPS()).withSeats(new Seat()).build();
	}

	public void makeSportsCar(Builder builder) {

	}
}
