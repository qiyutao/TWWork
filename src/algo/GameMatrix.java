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
	
	//TODO:refactor
	private void nextMatrix() {
		for(int i = 0;i<height;i++) {
			for (int j = 0; j < width; j++) {
				int lifeNum = aroundLife(i, j);
				if(lifeNum<2) {
					matrix[i][j] = false;
				} else if(lifeNum==2 && matrix[i][j]) {
					matrix[i][j] = true;
				} else if(lifeNum==3) {
					matrix[i][j] = true;
				} else {
					matrix[i][j] = false;
				}
			}
		}
	}
	
	private int aroundLife(int row,int col) {
		int lifeNum = 0;
		for (int i = col - 1; i < col + 2; i++) {
			for (int j = row - 1; j < row + 2; j++) {
				if (( i>= 0 && i <= width) && (j >= 0 && j <= height)
					 &&(i!=col&&j!=row)) {
					if(matrix[i][j])
					lifeNum += matrix[i][j] == false ? 0 : 1;
					}
				}
			}
		
		return lifeNum;
	}

	public boolean[][] getMatrix() {
		return matrix;
	}
}
