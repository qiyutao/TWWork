package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.GameController;

/**
 * Customized Frame
 * 
 * @author DaiQing
 */
public class AlgoFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	/**
	 * Frame 窗口大小
	 */
	private int canvasWidth;
	private int canvasHeight;

	// 生命circle
	private LifeCircle[][] circles;

	// 刷新频率
	private int timePeriod;

	GameController controller;
	
	// 分辨率
	private static final int RESOLUTION_X = 1800;
	private static final int RESOLUTION_Y = 768;
	
	public AlgoFrame(String title) {
		this(title, RESOLUTION_X, RESOLUTION_Y);
	}

	public AlgoFrame(String title, int canvasWidth, int canvasHeight) {
		super(title);
		this.canvasWidth = canvasWidth;
		this.canvasHeight = canvasHeight;
		AlgoCanvas canvas = new AlgoCanvas();

		// set frame basic info
		this.setSize(canvasWidth, canvasHeight);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		// set panel
		canvas.setPreferredSize(canvas.getPreferredSize());
		this.setContentPane(canvas);
		this.pack();
		
		//TODO: set dialog, get cluster number && refresh period
		//timePeriod =
		int clusterInit = 3;  
		// start Controller 
		controller = new GameController(timePeriod, clusterInit, RESOLUTION_X /2, RESOLUTION_Y / 2); 
		
		circles = controller.getLives();
		
		// fresh thread
		RefreshCtl refreshCtl = new RefreshCtl(this, timePeriod, controller);
		new Thread(refreshCtl).start();
	}

	/**
	 * 根据传入内容绘制
	 * 
	 * @param circles
	 */
	public void render(LifeCircle[][] circles) {
		this.circles = circles;
		this.repaint();
	}

	public int getCanvasWidth() {
		return canvasWidth;
	}

	public int getCanvasHeight() {
		return canvasHeight;
	}

	/**
	 * 
	 * @author DaiQing
	 */
	private class AlgoCanvas extends JPanel {

		public AlgoCanvas() {
			// 设置双缓存
			super(true);
		}

		/**
		 * g:绘制的上下文环境
		 */
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D graphics2d = (Graphics2D) g;
			// 设置渲染，抗锯齿
			RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			graphics2d.addRenderingHints(hints);

			// 设置笔刷信息
			AlgoVisHelper.setStrokeWidth(graphics2d, 10);
			
			if (new Random().nextDouble() < 0.5)
				graphics2d.setColor(Color.RED);
			else
				graphics2d.setColor(Color.BLUE);
			// 实心
			AlgoVisHelper.fillCircle(graphics2d, canvasWidth / 2, canvasHeight / 2, 200);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(canvasWidth, canvasHeight);
		}
	}
}