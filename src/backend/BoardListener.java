package backend;

/**
 * Watches the actions in the board and tells the game.
 */
public interface BoardListener {

	/**
	 * Event launched when a box is thrown into a hole
	 */
	public void boxLost();

	/**
	 * Event launched when the player makes a permitted move in the board.
	 */
	public void incrementScore();
}
