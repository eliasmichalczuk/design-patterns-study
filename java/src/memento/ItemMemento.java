package memento;

public class ItemMemento implements Memento<Item> {

	public Product product;
	public int quantity;

	public ItemMemento(Product product2, int quantity2) {
		this.product = product2;
		this.quantity = quantity2;
	}

	@Override
	public Item getState() {
		return new Item(product, quantity);
	}
	
}
