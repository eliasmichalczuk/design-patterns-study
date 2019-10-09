package osbserver;

import java.util.Calendar;
import java.util.TimeZone;

public class EmailListener implements EventSubscriber{

	private EventManager eventMan;
	
	public EmailListener(EventManager eventMan) {
		this.eventMan = eventMan;
		this.eventMan.subscribe(this, "save");
	}

	@Override
	public void update(String filename, EventManager evnt) {
		System.out.println(filename + " was changed at: " + Calendar.getInstance(TimeZone.getDefault()).getTime());
	}
}
