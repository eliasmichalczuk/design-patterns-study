package command;

public class AddCommand implements Compute {
	
	private int[] numbers;
	private Calculator calculator;

	public AddCommand(Calculator calculator, int[] numbers) {
		this.calculator = calculator;
		this.numbers = numbers;
	}

	@Override
	public void execute() {
		this.calculator.add(numbers);
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
