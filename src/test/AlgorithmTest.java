package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void testNextStatus() {
		boolean[][] graph = {
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
		};
		boolean[][] nextGraph = {
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
		};
		assertArrayEquals(graph, nextGraph);
	}

}
