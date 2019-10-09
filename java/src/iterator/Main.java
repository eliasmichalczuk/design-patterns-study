package iterator;

import iterator.Products.ProductIterator;

public class Main {
	public static void main(String[] args) throws Exception {
		Products list = new Products();
		list.add(new Product("shoe", 23));
		list.add(new Product("dress", 67));
		list.add(new Product("coat", 45));
		ProductIterator itratr = (ProductIterator) list.getItr();
		System.out.println(itratr.next());
		System.out.println(itratr.next());
		System.out.println(itratr.next());
		System.out.println("list has next " + itratr.hasNext() + " to be false");
	}
}