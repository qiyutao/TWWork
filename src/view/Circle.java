package view;

/**
 * 以圆点来表示每一个生命
 * @author DaiQing
 *
 */
public class Circle {
	public int x,y;
	private int r;
	public int vx, vy;
	
	public Circle(int x, int y, int r, int vx, int vy) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.vx = vx;
		this.vy = vy;
	}

	public int getR() {
		return r;
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
}
