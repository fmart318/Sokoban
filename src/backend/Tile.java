package backend;

public abstract class Tile {

	/**
	 * @see access
	 * @return Boolean si accedio o no.
	 */
	abstract boolean access(Movable e, Cardinal c);

	/**
	 * 
	 * @param e
	 *            Elemento que quiero poner en el Tile.
	 * @param c
	 *            Cardinal que dice hacia donde me estoy moviendo
	 * @return Boolean si se accedio o no
	 */
	boolean isAccesible(Movable e, Cardinal c) {
		return access(e, c);
	}

}
