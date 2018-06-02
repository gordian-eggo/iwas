import java.util.*;

public class Player extends Entity {

	protected int shield_strength;
	protected int enemies_avoided;

	public Player() {
		this.shield_strength = 1;
		this.enemies_avoided = 0;
		findInitialPosition();
	}

	void findInitialPosition() {	// centers the player on the lower half of the screen 

	}

	void upgradeShield() {
		if (this.shield_strength < 3) {
			this.shield_strength++;
		}
	}

	void forward(int dY) {			// player moves forward, pre-graphics
		this.xPos = xPos;
		this.yPos = yPos + dY;
	}

	void backward(int dY) {			// player moves backward, pre-graphics
		this.xPos = xPos;
		this.yPos = yPos - dY;		
	}

	void left(int dX) {				// player moves left, pre-graphics
		this.xPos = xPos - dX;
		this.yPos = yPos;
	}

	void right(int dX) {				// player moves right, pre-graphics
		this.xPos = xPos + dX;
		this.yPos = yPos;
	}

}