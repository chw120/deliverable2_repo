package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class GameTest {

	private House house = mock(House.class);
	private Player player = mock(Player.class);
	private Game game = new Game(player, house);

	//game
	//test1 dosomethong(str)
	@Test
	public void test1DoSomething(){

		int result1 = game.doSomething("N");
		assertEquals(0, result1);
		verify(house,times(1)).moveNorth();

	}

	//game
	//test2 dosomethong(str)
	@Test
	public void test2DoSomething(){

		int result2 = game.doSomething("n");
		assertEquals(0, result2);
		verify(house,times(0)).moveNorth();
	}

	//game
	//test3 dosomethong(str)
	@Test
	public void test3DoSomething(){

		when(player.drink()).thenReturn(true);
		int result3 = game.doSomething("d");
		assertEquals(1, result3);
		verify(player,times(1)).drink();
	}
}
