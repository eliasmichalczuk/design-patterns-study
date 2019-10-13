package templateMethod;

public class Soda extends BeverageProducerTemplate{

	@Override
	protected void makeBeverage() {
		System.out.println("making soda with special ingredients");
		
	}

	@Override
	protected void pack() {
		System.out.println("packing soda");
		
	}

	@Override
	protected void makePackage() {
		System.out.println("making package for soda dimensions");
		
	}

}
