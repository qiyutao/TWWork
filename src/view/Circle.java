package view;

/**
 * 以圆点来表示每一个生命
 * @author DaiQing
 *
 */
public class Circle {
	
	// 圆心坐标
	private int x,y;
	
	// 圆的半径大小
	private int r = 1;
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getR() {
		return r;
	}
}
