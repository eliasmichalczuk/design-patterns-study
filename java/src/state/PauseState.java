package state;

public class PauseState implements State{

	PongGameModel context;
	public PauseState(PongGameModel pongGameModel) {
		this.context = pongGameModel;
	}

	@Override
	public void showMessage() {
		System.out.println("Game is paused");
	}

	@Override
	public void refresh() {
	}
	
	public void sendPaddleLocationToServer() {
		System.out.println("Game is paused, cannot send location to server");
	}

	@Override
	public void enterGame(Player player) throws Exception {
		throw new Exception("Game is running - paused");
	}
	
	@Override
	public void pauseGame() {
		System.out.println("Game is already paused");
	}
	
	@Override
	public void restartGame() {
		System.out.println("Restarting game");
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		
	}
}
