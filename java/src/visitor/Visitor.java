package visitor;

public interface Visitor {

	public void offer(CofeeShop shop);
	public void offer(Bank bank);
	public void offer(Residence residence);
}
