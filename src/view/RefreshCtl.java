package view;

import controller.GameController;

public class RefreshCtl implements Runnable{
	
	private AlgoFrame algoFrame;
	
	private int refreshPeriod;
	
	private GameController gameController;
	
	public RefreshCtl(AlgoFrame algoFrame, int timePeriod, GameController controller) {
		this.algoFrame = algoFrame;
		this.refreshPeriod = refreshPeriod;
		this.gameController = gameController; 
	}
	
	@Override
	public void run() {
		while(true) {
			algoFrame.repaint();
			try {
				Thread.sleep(refreshPeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
