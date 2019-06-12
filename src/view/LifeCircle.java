package view;

/**
 * 以圆点来表示每一个生命
 * @author DaiQing
 *
 */
public class LifeCircle {
	
	// 圆心坐标
	private int x,y;
	
	// 圆的半径大小
	public static int R = 1;
	
	// 是否存活
	private boolean alive;
	
	// 已经存活的周期
	private int longivity;
	
	public LifeCircle(int x, int y, boolean alive) {
		super();
		this.x = x;
		this.y = y;
		this.alive = alive;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getLongivity() {
		return longivity;
	}

	public void setLongivity(int longivity) {
		this.longivity = longivity;
		//TODO: 设置生命颜色
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
