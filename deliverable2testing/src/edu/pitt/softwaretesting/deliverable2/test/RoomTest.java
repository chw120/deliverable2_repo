package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
	
	Room room = new Room(false, false, false, false, true);
	
	//in 2nd room ??
	@Test
	public void testGetDescription(){
		
		String result = room.getDescription();
		String expected = "\nYou see a Funny room.\n" + "It has a Sad record player.\n" + "A Beige door leads South.\n";
	
	    assertEquals(expected, result);
	}
		
	
	@Test
	public void testHasItem(){
		
	    boolean actual = room.hasItem();
	    assertFalse(actual);
	}
	

}
