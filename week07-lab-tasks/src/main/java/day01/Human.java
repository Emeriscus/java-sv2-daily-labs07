package day01;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {

        NameValidator nameValidator = new NameValidator();
        YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();

        if (nameValidator.isNameValid(name) && yearOfBirthValidator.isYearOfBirthValid(yearOfBirth)) {
            this.yearOfBirth = yearOfBirth;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
