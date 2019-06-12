package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
	
	private Circle[] circles;
	
	// 刷新频率
	private int timePeriod;
	
	public AlgoFrame(String title) {
		this(title, 1800, 768);
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
	}
	
	/**
	 * 根据传入内容绘制
	 * @param circles
	 */
	public void render(Circle[] circles) {
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
			// 清空
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.removeAll();
			// 设置渲染，抗锯齿
			RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			graphics2d.addRenderingHints(hints);
			
			// 设置笔刷信息
			AlgoVisHelper.setStrokeWidth(graphics2d, 10);

			graphics2d.setColor(Color.RED);
			// 实心
			AlgoVisHelper.fillCircle(graphics2d, canvasWidth / 2, canvasHeight / 2, 200);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(canvasWidth, canvasHeight);
		}
	}
}