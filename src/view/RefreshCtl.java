package view;

import controller.GameController;

public class RefreshCtl implements Runnable{
	
	private AlgoFrame algoFrame;
	
	private int refreshPeriod;
	
	private GameController gameController;
	
	public RefreshCtl(AlgoFrame algoFrame, int timePeriod, GameController controller) {
		this.algoFrame = algoFrame;
		this.refreshPeriod = timePeriod;
		this.gameController = controller; 
	}
	
	@Override
	public void run() {
		while(true) {
			gameController.nextStep();
			algoFrame.repaint();
			try {
				Thread.sleep(refreshPeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
