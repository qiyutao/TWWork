package controller;

import algo.GameMatrix;
import view.LifeCircle;

public class GameController {

	private LifeCircle[][] lives;
	private int dimensionX;
	private int dimensionY;
	
	private GameMatrix matrix;

	public GameController(int clusterInit, int resolutionX, int resolutionY) {
		dimensionX = resolutionX / 2;
		dimensionY = resolutionY / 2;
		matrix = new GameMatrix(dimensionX, dimensionY, clusterInit);
		lives = new LifeCircle[dimensionY][dimensionX];
		boolean[][] initLife = matrix.init();
		for (int i = 0; i < this.dimensionY; i++) {
			for (int j = 0; j < this.dimensionX; j++) {
				lives[i][j] = new LifeCircle((1 + 2 * i) * LifeCircle.R, (1 + 2 * j) * LifeCircle.R,
						initLife[i][j] ? true : false);
			}
		}
	}

	public LifeCircle[][] getLives() {
		return lives;
	}

	public LifeCircle[][] nextStep() {
		matrix.nextMatrix();
		this.updateLives(matrix.getMatrix());
		return lives;
	}
	
	public void updateLives(boolean[][] life) {
		for (int i = 0; i < this.dimensionY; i++) {
			for (int j = 0; j < this.dimensionX; j++) {
				LifeCircle curLife = lives[i][j];
				boolean pastState = lives[i][j].isAlive();
				curLife.setAlive(life[i][j] ? true : false);
				if (!pastState && curLife.isAlive())
					curLife.setLongivity(1);
				else if (curLife.isAlive())
					curLife.setLongivity(curLife.getLongivity() + 1);
				else if (pastState && !curLife.isAlive()) 
					curLife.setLongivity(0);
			}
		}
	}
}
