import java.util.*;
import java.io.*;

public class Board {

	protected Enemy enemy;
	protected Player ship = new Player();
	protected ArrayList<Enemy> hive = new ArrayList<Enemy>();
	protected int enemy_count;
	protected boolean end_game = false;
	protected GUI game_GUI = new GUI();

	public Board() {
		generateEnemies();
	}

	void generateEnemies() {
		while (end_game) {
			enemy = new Enemy();
			hive.add(enemy);
			enemy_count++;
		}
	}

	void spawnPlayer() {
		
		ship.xPos = 25;
		ship.yPos = 50;

	}
	
}