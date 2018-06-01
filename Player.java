import java.util.*;

public class Player extends Entity {

	public Player() {
		findInitialPosition();
	}

	void findInitialPosition() {	// centers the player on the lower half of the screen 

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