package state;

public class WaitingPlayersToConfirmState implements State {

	private PongGameModel context;

	public WaitingPlayersToConfirmState(PongGameModel context) {
		this.context = context;
	}

	@Override
	public void refresh() {
		System.out.println("Game is not runnuing");
	}
	
	public void sendPaddleLocationToServer() {
		System.out.println("Game is not runnuing");
	}
	
	public void confirmGameStart() {
		System.out.println("Starting game...");
		this.context.state = new RunningState(context);
	}

	@Override
	public void enterGame(Player player) throws Exception {
		throw new Exception("Game is running - paused");
	}

	@Override
	public void pauseGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restartGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startGame() {
		System.out.println("Player confirmed, starting game");
		this.context.state = new RunningState(context);
		
	}
}
