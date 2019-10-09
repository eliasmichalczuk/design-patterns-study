package mediator;

import java.util.UUID;

public class User {

	private UUID id = UUID.randomUUID();
	private String name;
	
	
	public User(String string) {
		this.name = string;
	}

	public void receive(String message, String senderName) {
		System.out.println(senderName + " said to " + name + ": " + message);
	}
	
	public String getName() {
		return this.name;
	}
}
