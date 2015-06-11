package edu.pitt.softwaretesting.deliverable2.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class HouseTest {

	private Room[] rooms = new Room[6];
	//private Room[] rooms = mock(Room[].class);    ??
	private House house= new House(rooms);

	//house
	//test1 getcurrentroominfo()
	@Test
	public void test1GetCurrentRoomInfo(){

		house.moveSouth();
		String result1 = house.getCurrentRoomInfo();
		String str1 = "You are in a magical land! But you are returned to the beginning!";
		assertArrayEquals(result1.getBytes(), str1.getBytes());

	}

	//house
	//test2 getcurrentroominfo()
	@Test
	public void test2GetCurrentRoomInfo(){

		Room room = mock(Room.class);
		house.moveNorth();
		house.moveNorth();
		String result2 = house.getCurrentRoomInfo();
		verify(room,times(1)).getDescription();

	}

	//this will eventually check descriptions
	@Test
	public void testGetDescription(){
		Room room = mock(Room.class);
		when(room.getDescription()).thenReturn("TEST");
		Room[] rooms = new Room[1];
		rooms[0] = room;
		House house= new House(rooms);
		String result = house.getCurrentRoomInfo();
		assertEquals(result, "TEST");
		
	}

}
