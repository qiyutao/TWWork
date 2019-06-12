package controller;

import algo.GameMatrix;
import view.LifeCircle;

public class GameController {

	private LifeCircle[][] lives;
	private GameMatrix matrix;

	public GameController(int timePeriod, int clusterInit, int resolutionX, int resolutionY) {
		matrix = new GameMatrix(resolutionX / 2, resolutionY / 2, clusterInit);
		lives = new LifeCircle[resolutionY / 2][resolutionX / 2];
		boolean[][] init = matrix.init();

		for (int i = 0; i < resolutionY / 2; i++) {
			for (int j = 0; j < resolutionX / 2; j++) {
				lives[i][j] = new LifeCircle((1 + 2 * i) * LifeCircle.R, (1 + 2 * j) * LifeCircle.R);
			}
		}
	}

	public LifeCircle[][] getLives() {
		return lives;
	}

	public LifeCircle[][] nextStep() {
		matrix.nextMatrix();
		return lives;
	}

}
