
package backend;
/**
 * @author Tere
 *
 */
public class Target extends Floor implements Colorable {
	private Color color;
	
	public Target(Color color) {
		super();
		this.color=color;
	}
		
	public Color getColor() {
		return color;
	}
	
	/**
	 * Ver si puedo evitar el casteo a Colorable.
	 */
	public boolean sameColor(){
		return (this.getContent() instanceof Box && ((Colorable) this.getContent()).getColor().equals(color));
	}

}
	
	

