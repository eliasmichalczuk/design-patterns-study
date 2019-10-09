package memento;

import java.util.List;

public interface Memento<T> {

	public <S> S getState();
}
