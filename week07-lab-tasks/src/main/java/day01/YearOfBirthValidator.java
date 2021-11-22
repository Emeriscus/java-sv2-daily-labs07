package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {

    public boolean isYearOfBirthValid(int yearOfBirth){
        if (LocalDate.now().getYear()-yearOfBirth>120){
            throw new IllegalArgumentException(("A kor nem lehet több mint 120 év!"));
        }
        return true;
    }
}
