package templateMethod;

public class EnergyDrink extends BeverageProducerTemplate{

	@Override
	protected void makeBeverage() {
		System.out.println("making energy drink");
		
	}

	@Override
	protected void pack() {
		System.out.println("packing with special bottle dimensions");
		
	}

	@Override
	protected void makePackage() {
		System.out.println("making package with special bottle dimensions");
		
	}

}
