package memento;

import java.util.ArrayList;
import java.util.List;

public class CartMemento implements Memento<Cart> {
	
	private ArrayList<ItemMemento> items = new ArrayList<ItemMemento>();
	public CartMemento(ArrayList<Item> items) {
		items.forEach(e -> this.items.add(e.save()));
		
	}

	@Override
	public List<Item> getState() {
//		ArrayList<Item> items = new ArrayList<Item>();
//		this.items.forEach(e -> items.add(new Item(e)));
		return null;
	}

	
}
