package backend;

/**
 * 
 * @author Tere 28/5
 * 
 */

public class Floor extends Tile {
	private Movable content;
	private boolean ocuppied;
	
	public Floor() {
		this.removeContent();
	}
	
	public Floor(Movable e) {
		this.setContent(e);
	}
	
	public Movable getContent() {
		return content;
	}
	
	public void removeContent(){
		content=null;
		ocuppied=false;
	}
	
		
	public boolean setContent(Movable content) {
		if(content!=null){
			this.content = content;
			return true;
		}
		return false;
	}

	@Override
	boolean access(Movable e, Cardinal c) {
		if(ocuppied && !(e instanceof Box)){
			this.content.move(c);
		}
		return this.setContent(e);
	}
}
