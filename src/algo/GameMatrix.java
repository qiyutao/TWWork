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
		
		this.width = width;
		this.height = height;
		this.randomCluster = randomCluster;
	}

	public void init() {
		initRandomMat();
		
	}

	// 随机初始化簇
	private void initRandomMat() {
		for (int i = 0; i < randomCluster; i++) {
			int col = (int) (width * Math.random());
			int row = (int) (height * Math.random());

			for (int j = col - 1; j < col + 2; j++) {
				for (int k = row - 1; k < row + 2; k++) {
					if ((j >= 0 && j <= width) && (k >= 0 && k <= height)) {
						if (Math.random() * 2 >= 1) {
							matrix[k][j] = true;
						}
					}
				}
			}
		}
	}

	private void nextMatrix() {
		for(int i = 0;i<height;i++) {
			for (int j = 0; j < width; j++) {
				
			}
		}
	}

	public boolean[][] getMatrix() {
		return matrix;
	}
}
