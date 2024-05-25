package edu.atria.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class FirstTestClass {
	@Test
	public void getTestSquare() {
		int sq = ArithmeticOperations.getSquare(2);
		assertEquals(4,sq);
		}
	
	
}


