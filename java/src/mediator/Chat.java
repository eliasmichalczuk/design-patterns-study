package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatMediator{
	
	private ArrayList<User> userGroup;
	
	public Chat() {
		this.userGroup = new ArrayList<User>();
	}

	@Override
	public void send(String message, User user, User sender) {
		this.userGroup.get(this.userGroup.indexOf(user)).receive(message, sender.getName());
	}
	
	public void addUser(User user) {
		this.userGroup.add(user);
	}
}
