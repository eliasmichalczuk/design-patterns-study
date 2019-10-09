package state;

public class Main {

	public static void main(String[] args) throws Exception {
		var player = new Player("192.168.25.1", "Elias");
		var context = new PongGameModel();
		context.enterGame(player);
		context.startGame();
		context.pauseGame();
		context.pauseGame();
		context.restartGame();
	}
}
