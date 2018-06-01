import java.util.*;

public class Enemy {

	protected int xPos;
	protected int yPos;
	protected int dX;
	protected int dY;
	// graphic portion to come later

	public Enemy() {
		this.xPos = randomizePosition();
		this.dX = 0;
		this.dY = 0;
	}

	int randomizePosition() {			// randomize enemy's x-coordinate
		
		Random rand = new Random();
		//x = rand.nextInt()
		return xPos;

	}
}