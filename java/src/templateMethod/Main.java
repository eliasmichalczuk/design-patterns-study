package templateMethod;

public class Main {

	public static void main(String[] args) {
		var energyDrink = new EnergyDrink();
		energyDrink.make();
		
		var soda = new Soda();
		soda.make();
	}
}
