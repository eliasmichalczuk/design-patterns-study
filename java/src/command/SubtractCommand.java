package command;

public class SubtractCommand  implements Compute {
	
	private int[] numbers;
	private Calculator calculator;

	public SubtractCommand(Calculator calculator, int[] numbers) {
		this.calculator = calculator;
		this.numbers = numbers;
	}

	@Override
	public void execute() {
		this.calculator.subtract(numbers);
		
	}

	@Override
	public void undo() {
		this.calculator.subtract(numbers);
	}
}
