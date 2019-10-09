package chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Handler base = new ApplicationHandler();
		base.add(new ApplicationHandler());
		base.add(new ApplicationHandler());
		base.add(new ApplicationHandler());
		base.add(new ApplicationHandler());
		
		
		List<Request> requests = new ArrayList<Request>(List.of(new Request("one"),
				new Request("two"), new Request("three")));
		
		requests.forEach(request -> base.handle(request));
	}
}
