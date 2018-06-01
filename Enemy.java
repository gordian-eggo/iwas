import java.util.*;

public class Enemy extends Entity {

	// graphic portion to come later

	public Enemy() {
		this.xPos = randomizePosition();
		this.yPos = 0;
	}

	int randomizePosition() {			// randomize enemy's x-coordinate
		
		Random rand = new Random();
		//x = rand.nextInt()
		return xPos;

	}

	void advance() {					// enemy moves forward
		this.yPos++;
	}
}