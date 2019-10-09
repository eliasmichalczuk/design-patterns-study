package state;

public interface State {
	public default void showMessage() {}
	public void refresh();
	public void enterGame(Player player) throws Exception;
	public void sendPaddleLocationToServer();
	public void startGame();
	void pauseGame();
	void restartGame();
}
