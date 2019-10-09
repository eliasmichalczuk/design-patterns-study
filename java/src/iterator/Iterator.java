package iterator;

public interface Iterator<T> {

	public T next() throws Exception;
	public T previous() throws Exception;
	public int currentPosition();
	public default boolean hasNext() {return false;}
}
