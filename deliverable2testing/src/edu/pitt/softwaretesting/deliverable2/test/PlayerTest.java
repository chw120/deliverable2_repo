package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

	private Player player = new Player();

	//player
	//test hasallitems()
	@Test
	public void testHasAllItems() {

		assertFalse(player.hasAllItems());
	}

	//player
	//test drink() -- win
	@Test
	public void testWin(){

		player.getCoffee();
		player.getCream();
		player.getSugar();
		assertTrue(player.hasAllItems());
		assertTrue(player.drink());

	}

	//player
	//test drink() -- win
	@Test
	public void testDrink(){

		player.getCoffee();
		player.getCream();
		assertFalse(player.drink());

	}

}
