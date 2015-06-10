package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;

import org.junit.*;

public class CoffeeMakerTest {

	//coffeemaker
	//test runAgrs()
	@Test
	public void testRunArgs(){
		CoffeeMaker coffeemaker = new CoffeeMaker();
		
		int result = coffeemaker.runArgs("str");
		assertEquals(0, result);
	}
	
	
}
