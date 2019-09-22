package builder;

public interface Car {

	public Car getEngine(); 
	public Car setEngine(Engine engine); 
	public Car getSeat(); 
	public Car setSeat(Seat seat); 
	public Car getTripComputer(); 
	public Car setTripComputer(TripComputer tripComputer); 
	public Car getGPS(); 
	public Car setGPS(GPS gps); 
}
