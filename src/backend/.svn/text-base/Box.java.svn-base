package backend;

import java.awt.Point;

/**
 * @Tere
 */

public class Box extends Movable implements Colorable{
	private Color color;
	
	public Box(Point p, Color c) {
		super(p);
		color = c;
	}
	
	public Color getColor() {
		return color;
	}
	
	public boolean remove(){
		setPositionOut();
	/**
	 * Cuando remuevo puedo verificar
	 * la cantidad de cajas existentes para ver si
	 * tiro un game over o no.	
	 */
		return true;
	}
	
	
	@Override
	public void move(Cardinal c) {
		if((Game.getGameBoard().getTile(this.position)).isAccesible(this, c)){
			setPosition(c);
		}
		
	}
	
	
	
}
