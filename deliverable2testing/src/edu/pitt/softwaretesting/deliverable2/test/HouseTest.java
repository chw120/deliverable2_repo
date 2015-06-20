package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class HouseTest {

	//house
	//test1 getcurrentroominfo()
	@Test
	public void test1GetCurrentRoomInfo(){

		House house= new House(6);
		house.moveSouth();
		String result1 = house.getCurrentRoomInfo();
		String str1 = "You are in a magical land! But you are returned to the beginning!";
		assertEquals( str1, result1);
		assertArrayEquals(str1.getBytes(), result1.getBytes());

	}

	//house
	//test2 getcurrentroominfo()
	//this will eventually check descriptions
	@Test
	public void testGetDescription(){
		Room room = mock(Room.class);
		when(room.getDescription()).thenReturn("TEST");
		Room[] rooms = new Room[1];
		rooms[0] = room;
		House house= new House(rooms);
		String result = house.getCurrentRoomInfo();
		assertEquals("TEST", result);
		
	}

	//house
	//test generaterooms()
	@Test
	public void testGenerateRooms(){
		
		Room room = mock(Room.class);
		
		Room[] rooms = new Room[2];
		House house= new House(rooms);
		rooms = house.generateRooms(2);
		room = rooms[0];

		
		assertTrue(room.hasCream());
		assertFalse(room.hasCoffee());
		assertFalse(room.hasSugar());
		assertFalse(room.southExit());
		assertTrue(room.northExit());
	}
}
