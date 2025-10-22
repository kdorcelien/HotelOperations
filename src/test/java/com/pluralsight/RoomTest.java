package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkin_should_make_room_dirty_and_occupied() {
        Room room1Test = new Room(3,139.00);

        room1Test.checkIn();


        assertTrue(room1Test.isDirty());
        assertTrue(room1Test.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void checkout_should_make_room_dirty_false() {
        Room room1Test = new Room(3,139.00);

        room1Test.checkOut();


        assertTrue(room1Test.isDirty());
        assertFalse(room1Test.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void cleanroom_should_make_room_occupied_false() {
        Room room1Test = new Room(3,139.00);

        room1Test.cleanRoom();


        assertFalse(room1Test.isDirty());
        assertFalse(room1Test.isOccupied());
    }
}