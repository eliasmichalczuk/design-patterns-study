package state;

public class RunningState implements State {

	PongGameModel context;
	public RunningState(PongGameModel pongGameModel) {
		this.context = pongGameModel;
	}

	@Override
	public void refresh() {
		System.out.println("Refreshing paddles and ball positions");
		
	}
	
	public void sendPaddleLocationToServer() {
		System.out.println("Sending location");
	}

	@Override
	public void enterGame(Player player) throws Exception {
		throw new Exception("Game is running - paused");
	}

	@Override
	public void pauseGame() {
		System.out.println("Pausing game");
		this.context.state = new PauseState(context);
	}

	@Override
	public void restartGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		
	}
}
