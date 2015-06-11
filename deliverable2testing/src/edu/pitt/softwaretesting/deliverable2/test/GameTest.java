package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class GameTest {

	//PRECONDITIONS
	private House house = mock(House.class);
	private Player player = mock(Player.class);
	private Game game = new Game(player, house);

	//game
	//test1 dosomethong(str)
	@Test
	public void test1DoSomething(){

		//EXECUTION STEP
		int result1 = game.doSomething("N");
		//ASSERTIONS
		assertEquals(result1, 0);
		verify(house,times(1)).moveNorth();

	}

	//game
	//test2 dosomethong(str)
	@Test
	public void test2DoSomething(){

		int result2 = game.doSomething("n");
		assertEquals(result2, 0);
		verify(house,times(0)).moveNorth();
	}

	//game
	//test3 dosomethong(str)
	@Test
	public void test3DoSomething(){

		when(player.drink()).thenReturn(true);
		int result3 = game.doSomething("d");
		assertEquals(result3, 1);
		verify(player,times(1)).drink();
	}
}
