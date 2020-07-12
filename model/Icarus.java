package model;

public class Icarus {
	
	private String name;
	private String image;
	private long score;
	
	public void Icarus(){
		this.name = "Player";
		this.image = ""; // Default character image
		this.score = 0; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return score + "," + name;
	}
	
	
	
	

}
