package backend;

/**
 * Player class, has the state of the player (name and score) and has a method
 * to update the score.
 */
public class Player {
	private int score = 0;
	private final String name;

	/**
	 * Constructor receiving the two class variables as parameters
	 * 
	 * @param name
	 * @param score
	 */
	public Player(String name, int score) {
		this.score = score;
		this.name = name;
	}

	/**
	 * Constructor receiving as parameter the 'name' variable, the 'score'
	 * variable is set up to 0. Very handy for a "New Game"
	 * 
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	/**
	 * Increases in one the actual score
	 * 
	 * @return
	 */
	public int addScore() {
		return score++;
	}

	/**
	 * Returns the actual score of the player
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Returns the player's name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
}
