package backend;

/**
 * Uso la clase Place mas que nada para que los metodos del Board, setContent y
 * getContent sean mas faciles de usar!
 * 
 * @author daniel
 * 
 */
public class Place {

	/**
	 * La tile que contiene el place.
	 */
	private Tile content = null;

	/**
	 * Instancia un nuevo place con un determinado tile.
	 * 
	 * @param type
	 *            el tipo de tile deseado
	 */
	public Place(Tile type) {
		this.content = type;
	}

	/**
	 * Retorna el tile que contiene el place.
	 * 
	 * @return tile
	 */
	public Tile getContent() {
		return content;
	}

	/**
	 * Setea el place con un determinado tile.
	 * 
	 * @param aTile
	 *            el tipo de tile deseado
	 */
	public void setPlace(Tile tile) {
		this.content = tile;
	}
}
