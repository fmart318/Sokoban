package backend;

import java.awt.Point;
import java.util.ArrayList;

public class Game {
	public static final int MIN_HEIGHT = 5;
	public static final int MIN_WIDTH = 5;
	public static final int MAX_HEIGHT = 20;
	public static final int MAX_WIDTH = 20;
	private Player player;
	private final Board board;
	private ArrayList<Target> Targets;
	private ArrayList<Point> holePositions;
	private int numberOfBoxes;
	private final Point smilePosition;
	private final Smile theSmile;

	/**
	 * Instancia una nueva partida.
	 * 
	 * @param aLevel
	 *            un nivel
	 * @param aName
	 *            un nombre de jugador
	 */
	public Game(GameParser level, String aName, int aScore) {
		this.board = level.getLevelBoard();

		this.board.setListener(new BoardListener)() {

			public void boxThrown() {
				numberOfBoxes--;
			}

			@Override
			public void incrementScore() {
				player.addScore();

			}

			@Override
			public void boxLost() {
				// TODO Auto-generated method stub

			}

		};
		
		this.player = new Player(aName, aScore);
		this.smilePosition = level.getSmilePosition(); 
		this.theSmile = new Smile(smilePosition);
		this.numberOfBoxes = level.getNumberOfBoxes();
		this.levelName = level.getLevelName(); // lo saca del parser
		saveImportantPlaces(level.getLevelBoard()); // lo saca del parser
	}

	public Game(LoadLevel aLevel) {
		this(aLevel, aLevel.getPlayerName(), aLevel.getSavedScore());
	}

	/**
	 * Recorre todo el tablero, guardando los puntos clave
	 * 
	 * @param nivel
	 *            del tablero
	 */
	private void saveImportantPlaces(Board levelBoard) {
		Targets = new ArrayList<Target>();
		Holes = new ArrayList<Point>();

		for (int i = 0; i < levelBoard.getHeight(); i++) {
			for (int j = 0; j < levelBoard.getWidth(); j++) {
				Point tilePlace = new Point(i, j);
				Tile tileContent = levelBoard.getContent(tilePlace);
				if (tileContent instanceof Target)
					Targets.add(new Target(((Target) tileContent).getColor());
				else if (tileContent instanceof Hole)
					holePositions.add(new Point(i, j));
			}
		}
	}

	/**
	 * Retorna la posicion del smile
	 * 
	 * @return theSmile.getPosition()
	 */
	public Point getSmilePosition() {
		return smilePosition;
	}

	public void setPlayer(String playerName) {

		this.player = new Player(playerName);
	}

	/**
	 * Retorna el nombre del nivel.
	 * 
	 * @return nombre del nivel
	 */
	public String getLevelName() {
		return board.title;
	}

	public static Board getGameBoard() {
		return board;
	}

	public Player getPlayerName() {
		return player.getName();
	}

	/**
	 * Returns the current game score.
	 * 
	 * @return Integer
	 */
	public int getScore() {
		return player.getScore();
	}

	/**
	 * Returns an array with all the Targets
	 * 
	 * @return Targets
	 */
	public ArrayList<Target> getTargets() {
		return Targets;
	}

	/**
	 * Returns the width of the game board.
	 * 
	 * @return Integer
	 */
	public Integer getBoardWidth() {
		return board.getWidth();
	}

	/**
	 * Returns the height of the game board.
	 * 
	 * @return Integer
	 */
	public Integer getBoardHeight() {
		return board.getHeight();
	}

	/**
	 * Mira si la cantidad de cajas es la correcta para poder seguir jugando.
	 * 
	 * @return True si tengo suficientes cajas para seguir el juego. False sino.
	 */
	public boolean numOfBoxes() {
		return Targets.size() >= numOfBoxes;
	}

	/**
	 * retorna True si el juego est� ganado y False si hay menos cajas que
	 * targets revisar el equal de ArrayList
	 * 
	 * @return
	 */
	public boolean GameState() {
		return Targets.equals(FullTargets);
	}

}
