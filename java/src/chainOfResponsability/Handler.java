package chainOfResponsability;

public interface Handler {

	public void add(Handler handler);
	public void handle(Request request);
}
