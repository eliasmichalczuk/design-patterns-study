package osbserver;

import java.util.Calendar;
import java.util.TimeZone;

public class LogListener implements EventSubscriber {
	
	private EventManager eventMan;
	
	public LogListener(EventManager eventMan) {
		this.eventMan = eventMan;
		this.eventMan.subscribe(this, "open");
	}

	@Override
	public void update(String filename, EventManager evnt) {
		System.out.println(filename + " was opened at: " + Calendar.getInstance(TimeZone.getDefault()).getTime());
	}

}
