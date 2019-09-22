package builder;

public interface Builder {

	public void reset();
	public void setCar(Car car);
	public Builder withSeats(Seat seat);
	public Builder withEngine(Engine engine);
	public Builder withTripComputer(TripComputer computer);
	public Builder withGPS(GPS gps);
	public Car build();
}
