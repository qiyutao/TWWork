package view;
import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		//1. Java事件分发线程
		EventQueue.invokeLater(() -> {
			AlgoFrame frame = new AlgoFrame("Game of life");
		});
	}
}
