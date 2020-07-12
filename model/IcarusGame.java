package model;

public class IcarusGame {
	
	private Icarus character;	// make default Icarus character 
	private String image;		// background image, set default
	private String level; 		// easy, medium, hard
	
	public IcarusGame() {
		this.character = new Icarus();
		this.image = ""; 
		this.level = "easy"; 
	}

	public Icarus getCharacter() {
		return character;
	}

	public void setCharacter(Icarus character) {
		this.character = character;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	

}
