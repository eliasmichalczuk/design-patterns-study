package memento;

import java.util.ArrayList;

public class Item {

	private Product product;
	private int quantity;
	private ArrayList<Memento<Item>> mementos = new ArrayList<Memento<Item>>();
	
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Item(ItemMemento e) {
		// TODO Auto-generated constructor stub
	}

	public void changeQuantity(int number) {
		this.quantity = number;
		this.save();
	}
	
	public ItemMemento save() {
		ItemMemento memento = new ItemMemento(product, quantity);
		this.mementos.add(memento);
		return memento;
	}
}
