package mediator;

public interface ChatMediator {

	void send(String message, User user, User sender);
}
