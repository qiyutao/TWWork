package algo;

public class GameMatrix {
	// 随机点数目
	private int randomCluster;
	// 矩阵
	private boolean[][] matrix; 
	// 矩阵维度
	private int width;
	private int height;
	
	public GameMatrix(int width, int height, int randomCluster) {
		matrix = new boolean[width][height];
		
		randomCluster = randomCluster;
	}
	
	
	
	private void nextMatrix() {
		
	}

	public boolean[][] getMatrix() {
		return matrix;
	}
}
