package reflection;

public class Product {

	public String name;
	public float value;
	
	public Product(String name, float value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "" + this.name + ", " + this.value + " bucks";
	}
	
	public void setSelected(boolean bol) {
	}
}