package state;

public class PongGameModel implements State{
	
	private int leftPaddlePosition = 1; 
	private int rightPaddlePosition = 6;
	private int ballPosition = 4;
	private int ballDirection = -1;
	public State state = new WaitingForPlayersState(this);
	public Player mainPlayer;
	public Player player2;
	
	public PongGameModel() {
		System.out.println("waiting for players...");
	}
	
	
	public void refresh() {
		this.state.refresh();
	}


	@Override
	public void enterGame(Player player) throws Exception {
		this.state.enterGame(player);
	}


	@Override
	public void sendPaddleLocationToServer() {
		this.state.sendPaddleLocationToServer();
	}


	@Override
	public void pauseGame() {
		this.state.pauseGame();
	}


	@Override
	public void restartGame() {
		this.state.restartGame();
	}


	@Override
	public void startGame() {
		this.state.startGame();
	}
}
