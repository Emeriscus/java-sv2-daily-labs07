package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {

    YearOfBirthValidator yobv = new YearOfBirthValidator();

    @Test
    void yearOfBirthValidatorTest() {
        assertTrue(yobv.isYearOfBirthValid(1901));
    }

    @Test
    void YearOfBirthValidatorWrongYearTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> yobv.isYearOfBirthValid(1900));
        assertEquals("A kor nem lehet több mint 120 év!", iae.getMessage());
    }
}