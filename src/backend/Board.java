package backend;

import java.awt.Point;

public class Board {
	private final Place[][] board;
	private final int height;
	private final int width;
	public String title;
	private BoardListener listener;

	public Board(String title, Point point) {
		this.width = (int) point.getX();
		this.height = (int) point.getY();
		this.title = title;
		board = new Place[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				board[i][j] = new Place(new Floor());
			}
		}
	}

	/**
	 * Moves (@code Movable) tiles from one place to another if the destiny is
	 * valid and the movements are checked and authorized. Returns true if the
	 * movement could be done.
	 * 
	 * @param from
	 *            origin
	 * @param cardinal
	 *            movement direction
	 * 
	 * @return true if the movement could be done
	 */
	public boolean move(Point from, Cardinal cardinal) {
		/* Este es el punto al que me quiero dirigir */
		Point toPoint = new Point((int) (from.getX() + cardinal.getDirX()),
				(int) (from.getY() + cardinal.getDirY()));
		/* Este es el punto que le sigue en esa direccion */
		Point nextPoint = new Point(
				(int) (toPoint.getX() + cardinal.getDirX()),
				(int) (toPoint.getY() + cardinal.getDirY()));
		/* Si el punto al que quiero acceder esta en el tablero */
		if (validPosition(toPoint)) {
			/* Obtengo lo que tengo en mi tile */
			Tile actualTile = getContent(from);
			/* Obtengo lo que tengo en la tile a la que me quiero mover */
			Tile toTile = getContent(toPoint);
			/* Me fijo si puedo acceder a la tile que queria */
			/**
			 * TERE: ACA NO COMPILA, FIJATE SI SE PUEDEN CAMBIAR LOS METODOS DE
			 * LA CLASE TILE QUE HABIAS DEFINIDO VOS COMO PARA QUE ESTO ANDE
			 */
			if ((boolean) toTile.isAccesible(actualTile, cardinal)) {
				/* Si accedi, aumenta el score y devuelvo true */
				listener.incrementScore();
				return true;
				/*
				 * Si hay algo y es una posicion valida, voy a tener que ver si
				 * puedo mover esa caja!
				 */
			} else if (validPosition(nextPoint)) {
				if (moveBox(toPoint, nextPoint, cardinal)) {
					/* Setear una caja en una nueva posicion */
					/* Remover lo que habia en toTile */
					/* Aca suma un puntito porque se movio finalmente! */
					listener.incrementScore();
					return true;
				}
				return false;
			}
		}
		return false;
	}

	/**
	 * 
	 * Mueve la caja desde un punto a otro en caso de ser un movimiento válido.
	 * 
	 * @param boxActualPlace
	 * @param boxNextPlaumlce
	 * @param cardinal
	 * @return true si se pudo mover la caja
	 */
	private boolean moveBox(Point boxActualPlace, Point boxNextPlace,
			Cardinal cardinal) {

		Tile actualTile = getContent(boxActualPlace);
		Tile nextToTile = getContent(boxNextPlace);
		/* Me fijo si el lugar donde quiero mandar la caja tiene o no otra caja */
		/* MISMO PROBLEMA ACA TERE */
		if (nextToTile.isAccesible(actualTile, cardinal)) {
			/* Si no habia nada ahi, pongo mi caja */
			setContent(boxNextPlace, actualTile);
		}
		return false;
	}

	/**
	 * Returns the height of the board
	 * 
	 * @return int
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Returns the width of the board
	 * 
	 * @return int
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Receives a board's listener
	 * 
	 * @param aListener
	 */
	public void setListener(BoardListener aListener) {
		this.listener = aListener;
	}

	/**
	 * Checks that the position given falls inside the board boundaries
	 * 
	 * @param p
	 *            the position to be checked
	 * @return boolean
	 */
	public boolean validPosition(Point p) {
		return (p.x >= 0 && p.x < height && p.y >= 0 && p.y < width);
	}

	public Tile getContent(Point position) {
		return board[(int) position.getX()][(int) position.getY()].getContent();
	}

	public void setContent(Point position, Tile content) {
		board[(int) position.getX()][(int) position.getY()].setPlace(content);
	}
}