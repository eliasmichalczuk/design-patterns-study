package memento;

import java.util.ArrayList;

public class Cart implements Originator {

	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Memento<Cart>> mementos = new ArrayList<Memento<Cart>>();
	
	public Cart(ArrayList<Item> items2) {
		// TODO Auto-generated constructor stub
	}

	public void addItem(Item e) {
		this.items.add(e);
		this.save();
	}
	
	public void removeItem(Item e) {
		this.items.remove(e);
		this.save();
	}
	
	public void save() {
		this.mementos.add(new CartMemento(this.items));
	}
}
