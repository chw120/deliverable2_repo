package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;

public class CoffeeMakerTest {

	@Test
	public void testRunArgs(){
		CoffeeMaker coffeemaker = Mockito.mock(CoffeeMaker.class);
		
		int result = coffeemaker.runArgs("str");
		assertEquals(0, result);
	}
}
