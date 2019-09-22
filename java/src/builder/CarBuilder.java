package builder;

public class CarBuilder implements Builder{
	
	private Car car;

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCar(Car car) {
		this.car = car;
		
	}

	@Override
	public Builder withSeats(Seat seat) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Builder withEngine(Engine engine) {
		this.car.setEngine(engine);
		return this;
	}

	@Override
	public Builder withTripComputer(TripComputer computer) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Builder withGPS(GPS gps) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Car build() {
		return this.car;
	}
}
