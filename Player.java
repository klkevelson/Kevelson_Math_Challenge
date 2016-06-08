import java.awt.Color;


public class Player {
	
	public Player(int position, Color icon, int score) {
		super();
		this.position = position;
		this.icon = icon;
		this.score = score;
	}

	int position;
	
	Color icon;
	int score;
	
	public Player() {
		position = 0;
		icon = null;
		score = 0;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Color getIcon() {
		return icon;
	}

	public void setIcon(Color icon) {
		this.icon = icon;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

