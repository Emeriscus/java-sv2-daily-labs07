package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride){

        if (isValidRide(ride)){
            rides.add(ride);
        }else {
            throw new IllegalArgumentException("Invalid ride conditions");
        }
    }

    private boolean isValidDay(Ride ride){
        return ride.getDay() >= rides.get(rides.size()-1).getDay();
    }

    private boolean isValidNumberOfRide(Ride ride) {
        return ride.getNumberOfRide() >= rides.get(rides.size()-1).getNumberOfRide();
    }

    private boolean isValidRide(Ride ride){
        return isValidDay(ride) && isValidNumberOfRide(ride);
    }
}
