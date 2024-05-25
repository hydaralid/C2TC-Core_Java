package edu.atria.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SecondTestClass {
	@Disabled
	@Test
	public void findMaxArrayTest(){
		int a[] = {122, -45, -63, -23};
		int max = ArithmeticOperations.findMaximum(a);
		assertEquals(122,max);
	}
}
