package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmTest {

	@Test
	public void testNextStatusCase1() {
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

	@Test
	public void testNextStatusCase2() {
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

	@Test
	public void testNextStatusCase3() {
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

	@Test
	public void testNextStatusCase4() {
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

	@Test
	public void testNextStatusCase5() {
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

	@Test
	public void testNextStatusCase6() {
		boolean[][] graph = {
				{false, false, false, false, false, false, false },
				{false, false, true, false, false, false, false },
				{false, false, true, true, true, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
		};
		boolean[][] nextGraph = {
				{false, false, false, false, false, false, false },
				{false, false, true, false, false, false, false },
				{false, false, true, false, true, false, false },
				{false, false, false, true, true, false, false },
				{false, false, false, false, false, false, false },
				{false, false, false, false, false, false, false },
		};
		
		assertArrayEquals(graph, nextGraph);
	}
}
