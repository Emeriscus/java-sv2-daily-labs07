package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    @Test
    void isNameValidTest() {
        assertTrue(new NameValidator().isNameValid("Mekk Elek"));
    }

    @Test
    void isNameValidNullTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NameValidator().isNameValid(null));
        assertEquals("A név minimum két részből kell hogy álljon!", iae.getMessage());
    }

    @Test
    void isNameValidWrongNameTest(){
        IllegalArgumentException iae =assertThrows(IllegalArgumentException.class,
                () -> new NameValidator().isNameValid("Kiss"));
        assertEquals("A név minimum két részből kell hogy álljon!", iae.getMessage());
    }
}