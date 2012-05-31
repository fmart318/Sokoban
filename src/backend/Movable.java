package backend;

import java.awt.Point;
/**
 * Point es protected para poder acceder desde player y box.
 */

public abstract class Movable {
	protected Point position;
	
	public Movable(Point p) {
		position=p;
	}
	
	public void setPosition(Cardinal direction){
		position.x+=direction.getDirX();
		position.y+=direction.getDirY();
	}
	
	public void setPositionOut(){
		position.x-=1;
		position.y-=1;
	}
	
	public Point getPosition() {
		return position;
	}

	public abstract boolean remove();
	
	/**
	 * por ahora @return void
	 */
	public abstract void move(Cardinal c);
}
	

