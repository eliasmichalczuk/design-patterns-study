package visitor;

public class Bank implements Building{
	Visitor visitor;
	@Override
	public String getAddress() {
		return "221B baker sreet";
	}

	@Override
	public boolean isComercial() {
		return false;
	}

	@Override
	public boolean isOfficialBuilding() {
		return true;
	}
	
	@Override
	public void accept(Visitor v) {
		v.offer(this);
	}

}
