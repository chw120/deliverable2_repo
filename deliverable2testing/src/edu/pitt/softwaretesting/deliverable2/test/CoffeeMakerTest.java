package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;

import org.junit.*;

public class CoffeeMakerTest {

	//coffeemaker
	//test runAgrs() that this method always return 0
	@Test
	public void testRunArgs(){
		CoffeeMaker coffeemaker = new CoffeeMaker();
		
		int result = coffeemaker.runArgs("str");
		assertEquals(result, 0);
	}
	
	
}
