package visitor;

public class CofeeShop implements Building{

	Visitor visitor;
	@Override
	public String getAddress() {
		return "Getulio Vargas 25";
	}

	@Override
	public boolean isComercial() {
		return true;
	}

	@Override
	public boolean isOfficialBuilding() {
		return false;
	}
	
	@Override
	public void accept(Visitor v) {
		v.offer(this);
	}

}
