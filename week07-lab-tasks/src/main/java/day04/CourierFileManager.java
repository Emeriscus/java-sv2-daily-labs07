package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {
        return getCourier(getRideListStringByFile(path));
    }

    private List<String> getRideListStringByFile(Path path) {

        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

    private Courier getCourier(List<String> rideListString) {
        Courier courier = new Courier();
        for (String actual : rideListString) {
            courier.addRide(getRide(actual));
        }
        return courier;
    }

    private int getDay(String actual) {
        try {
            return Integer.parseInt(actual.split(" ")[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not a number", e);
        }
    }

    private int getNumberOfRide(String actual) {
        try {
            return Integer.parseInt(actual.split(" ")[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not a number", e);
        }
    }

    private int getDistance(String actual) {
        try {
            return Integer.parseInt(actual.split(" ")[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not a number", e);
        }
    }

    private Ride getRide(String actual) {
        return new Ride(getDay(actual), getNumberOfRide(actual), getDistance(actual));
    }

}
