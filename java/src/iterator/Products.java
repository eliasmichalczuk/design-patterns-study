package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Products {
	
	private List<Product> list = new ArrayList<Product>();
	private Product current;
	private int currentIndex;
	private Product previous;
	
	public class ProductIterator implements Iterator<Product> {

		@Override
		public Product next() throws Exception {
			if (list.isEmpty()) throw new Exception("No items");
			previous = current;
			current = list.get(currentIndex++);
			return current;
		}

		@Override
		public Product previous() throws Exception {
			if (previous == null) throw new Exception("No previous"); 
			return previous;
		}

		@Override
		public int currentPosition() {
			return currentIndex;
		}

		@Override
		public boolean hasNext() {
			return currentIndex < list.size();
		}

	}
	
	public void add (Product e) {
		this.list.add(e);
	}
	
	public Iterator getItr() {
		return new ProductIterator();
	}
}

