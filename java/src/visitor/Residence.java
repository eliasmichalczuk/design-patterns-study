package visitor;

public class Residence implements Building{
	Visitor visitor;
	@Override
	public String getAddress() {
		return "Rua São paulo, 895";
	}

	@Override
	public boolean isComercial() {
		return false;
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
