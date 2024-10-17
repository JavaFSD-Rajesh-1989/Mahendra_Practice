package com.javaunit.testcase;
import static org.junit.Assert.*;
import org.junit.Test;
import com.junit.logic.*;
public class CalculationLogic {

	@Test
	public void testFindMax()
	{
		assertEquals(4,calculation.findMax(new int[]{1,2,3,4}));
		assertEquals(-1,calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}
}
