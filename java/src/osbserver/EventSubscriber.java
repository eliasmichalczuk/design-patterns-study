package osbserver;

public interface EventSubscriber {

	public void update(String filename, EventManager evnt);
}
