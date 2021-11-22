package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testHumanConstructorValidDatas() {
        Human human = new Human("Papp Géza", 1901);

        assertEquals("Papp Géza", human.getName());
        assertEquals(1901, human.getYearOfBirth());
    }

    @Test
    void testHumanConstructorInvalidName() {

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("PappPisti", 1901));

        assertEquals("A név minimum két részből kell hogy álljon!", iae.getMessage());
    }

    @Test
    void testHumanConstructorNullName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human(null, 1901));

        assertEquals("A név minimum két részből kell hogy álljon!", iae.getMessage());
    }

    @Test
    void testHumanConstructorWrongYearOfBirth() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("Papp Pisti", 1900));

        assertEquals("A kor nem lehet több mint 120 év!", iae.getMessage());
    }
}