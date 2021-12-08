package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    @Test
    void createCourierByFileTest() {
        CourierFileManager courierFileManager=new CourierFileManager();
        Courier expected= courierFileManager.createCourierByFile(Path.of("src/test/resources/rides.txt"));

        assertEquals(6, expected.getRides().size());
    }

    @Test
    void createCourierByInvalidFileTest() {
        CourierFileManager courierFileManager=new CourierFileManager();

        IllegalStateException ise=assertThrows(IllegalStateException.class,
                () ->courierFileManager.createCourierByFile(Path.of("src/test/resources/ride.txt")));

        assertEquals("Can't read file", ise.getMessage());
    }
}