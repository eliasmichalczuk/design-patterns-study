package command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {
	
	int value = 0;
	List<Integer> state = new ArrayList<Integer>();

	public void add(int[] numbers) {
		this.state.add(value);
		this.value += IntStream.of(numbers).parallel().sum();
	}
	
	public void subtract(int[] numbers) {
		this.state.add(value);
		this.value -= IntStream.of(numbers).parallel().sum();
	}
}
