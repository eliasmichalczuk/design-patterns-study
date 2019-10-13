package visitor;

public interface Building {

	public String getAddress();
	public boolean isComercial();
	public boolean isOfficialBuilding();
	public void accept (Visitor v);
}
