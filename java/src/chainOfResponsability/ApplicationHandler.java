package chainOfResponsability;

import java.util.Random;

public class ApplicationHandler implements Handler {
	
	Handler nextInChain;
	private static int nextID = 1;
	private int id = nextID++;

	public ApplicationHandler() {
	}
	@Override
	public void add(Handler next) {
		if (nextInChain == null) {
			this.nextInChain = next;
		} else {
			nextInChain.add(next);
		}
	}

	@Override
	public void handle(Request request) {
		if (new Random().nextInt(3) == 2) {
			System.out.println(id + " handled request: " + request);
		} else {
			System.out.println(id + " discarded request " + request);
		}
		if (nextInChain != null) nextInChain.handle(request);
	}

	
}
