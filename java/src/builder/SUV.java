package builder;

public class SUV implements Car {

	public Seat seat;
	public Engine engine;
	public TripComputer TripComputer;
	public GPS gps;
	@Override
	public Car getEngine() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car setEngine(Engine engine) {
		if (engine instanceof SportEngine) throw new IllegalArgumentException("SUV cannot be built using a sports car engine");
		return null;
	}
	@Override
	public Car getSeat() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car setSeat(Seat seat) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car getTripComputer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car setTripComputer(TripComputer tripComputer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car getGPS() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Car setGPS(GPS gps) {
		// TODO Auto-generated method stub
		return null;
	}
}
