package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier courier = new Courier();

    @BeforeEach
    void init(){
        courier.addRide(new Ride(1, 2, 15));
        courier.addRide(new Ride(3, 2, 25));
        courier.addRide(new Ride(3, 3, 35));
        courier.addRide(new Ride(4, 2, 10));

    }

    @Test
    void addValidRideTest(){

        courier.addRide(new Ride(4, 4, 23));



        assertEquals(5, courier.;);



    }

}