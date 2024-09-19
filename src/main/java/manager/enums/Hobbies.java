package manager.enums;

public enum Hobbies {

    SPORTS("label[for='hobbies-checkbox-1']"),
    READING("label[for='hobbies-checkbox-1']"),
    MUSIC("label[for='hobbies-checkbox-1']");


    private final String locator;


    Hobbies(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
