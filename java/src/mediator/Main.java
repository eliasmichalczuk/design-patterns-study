package mediator;

public class Main {

	public static void main(String[] args) {
		Chat chat = new Chat();
		User user1 = new User("Patrícia");
		User user2 = new User("João");
		
		chat.addUser(user1);
		chat.addUser(user2);
		
		chat.send("oi joão", user2, user1);
		chat.send("ooooi", user1, user2);
	}
}
