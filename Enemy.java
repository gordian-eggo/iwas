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
		xPos = x_coor.nextInt(50) + 1;
		return xPos;

	}

	int generateAdvanceSpeed() {

		Random speed_val = new Random();
		advance_speed = speed_val.nextInt(4) + 1;

		return advance_speed;
	}

	void advance() {					// enemy moves forward
		try {
			switch(advance_speed) {
				case 1: this.yPos++;
				case 2: this.yPos = this.yPos + 2;
				case 3: this.yPos = this.yPos + 3;
				case 4: this.yPos = this.yPos + 4;
				case 5: this.yPos = this.yPos + 5;
				default: System.out.println("System error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}