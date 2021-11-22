package day01;

public class NameValidator {

    public boolean isNameValid(String name) {
        if (name == null || name.indexOf(" ") == -1) {
            throw new IllegalArgumentException("A név minimum két részből kell hogy álljon!");
        }
        return true;
    }
}
