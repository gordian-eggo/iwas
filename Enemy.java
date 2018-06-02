import java.util.*;

public class Enemy extends Entity {

	protected int advance_speed;
	// graphic portion to come later

	public Enemy() {
		this.xPos = randomizePosition();
		this.yPos = 0;
		this.advance_speed = generateAdvanceSpeed();
	}

	int randomizePosition() {			// randomize enemy's x-coordinate
		
		Random x_coor = new Random();
		//x = rand.nextInt()
		return xPos;

	}

	int generateAdvanceSpeed() {

		Random speed_val = new Random();
		advance_speed = speed_val.nextInt(4) + 1;

		return advance_speed;
	}

	void advance() {					// enemy moves forward
		this.yPos++;
	}


}