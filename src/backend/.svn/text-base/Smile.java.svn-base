package backend;

import java.awt.Point;

public class Smile extends Movable {

	public Smile(Point p) {
	super(p);
	}
		
	@Override
	public boolean remove() {
		/**
		 * GAME OVER.
		 */
		return true;
	}
	

	@Override
	public void move(Cardinal c) {
		if((Game.getGameBoard().getTile(this.position)).isAccesible(this,c)){
				setPosition(c);
				/**
				 * Aumentar score.
				 */
							
		}
	}	
}
