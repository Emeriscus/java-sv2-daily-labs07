package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {

    @Test
    void createRideTest(){
        Ride ride=new Ride(1, 2, 25);

        assertEquals(1, ride.getDay());
        assertEquals(2, ride.getNumberOfRide());
        assertEquals(25, ride.getDistance());
    }
}