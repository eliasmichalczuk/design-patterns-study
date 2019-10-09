package state;

public class WaitingForPlayersState implements State{


	PongGameModel context;
	public WaitingForPlayersState(PongGameModel pongGameModel) {
		this.context = pongGameModel;
	}

	@Override
	public void showMessage() {
		System.out.println("waiting for players...");
	}

	@Override
	public void refresh() {
	}
	
	public void enterGame(Player player) {
		if (this.context.mainPlayer == null) {
			this.context.mainPlayer = player;
		}
		this.context.state = new WaitingPlayersToConfirmState(context);
	}
	
	public void sendPaddleLocationToServer() {
		System.out.println("Game is not running");
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
		// TODO Auto-generated method stub
		
	}
}
