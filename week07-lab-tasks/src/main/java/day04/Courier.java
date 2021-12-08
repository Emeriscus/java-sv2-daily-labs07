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

    private boolean isValidRide(Ride ride){
        if (isValidDay(ride)){
            return isValidNumberOfRide(ride);
        }
        return false;
    }

    private boolean isValidDay(Ride ride){
        if (rides.size()==0) {
            return true;
        }
        return ride.getDay() >= rides.get(rides.size()-1).getDay();
    }

    private boolean isValidNumberOfRide(Ride ride) {
        if (rides.size()==0){
            return true;
        }
        if (ride.getDay()==rides.get(rides.size()-1).getDay()) {
            return ride.getNumberOfRide() >= rides.get(rides.size() - 1).getNumberOfRide();
        }
        return true;
    }

    public List<Ride> getRides() {
        return rides;
    }
}
