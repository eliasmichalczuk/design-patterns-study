package templateMethod;

// company that makes different beverages
public abstract class BeverageProducerTemplate {

	public BeverageProducerTemplate() {}
	
	public void make() {
		makePackage();
		makeBeverage();
		pack();
		putOnTruck();
	}

	protected abstract void makeBeverage();

	private final void putOnTruck() {
		System.out.println("placing produced beverage on the transport truck");
	}

	protected abstract void pack();

	protected abstract void makePackage();
}
