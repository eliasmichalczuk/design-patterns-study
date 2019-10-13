package visitor;

public class InsuranceAgent implements Visitor{

	public void offer(CofeeShop shop) {
		System.out.println("offering fire and flood insurence");
	}
	public void offer(Bank bank) {
		System.out.println("offering theft insurence");
	}
	public void offer(Residence residence) {
		System.out.println("offering medicial insurence to residence");
	}
	
	
	public static void main(String[] args) {
		var visitor = new InsuranceAgent();
		var building = new CofeeShop();
		var bank = new Bank();
		building.accept(visitor);
		bank.accept(visitor);
	}
}

