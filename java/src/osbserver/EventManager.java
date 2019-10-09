package osbserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

//	private List<EventSubscriber> subscribers1 = new ArrayList<EventSubscriber>();
	private HashMap<String, EventSubscriber> subscribers = new LinkedHashMap<String, EventSubscriber>();
	
	public void subscribe(EventSubscriber s, String eventType) {
//		this.subscribers.add(s);
		this.subscribers.put(eventType, s);
	}
	
	public void unsubscribe(EventSubscriber s, String eventType) {
		this.subscribers.remove(eventType, s);
	}
	
	public void notify(String event, String file) {
//		this.subscribers.forEach(s -> s.update(file, event, this));
		for (Map.Entry<String, EventSubscriber> subscriber : this.subscribers.entrySet()) {
			if (subscriber.getKey() == event) {
				subscriber.getValue().update(file, this);
			}
		}
	}
}
