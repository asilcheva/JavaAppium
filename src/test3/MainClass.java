package test3;

public class MainClass {
    private String class_string = "Hello, world";

    public String getClassString() {
        return class_string;
    }

    public boolean containsSubstring() {
        return this.getClassString().contains("hello") || this.getClassString().contains("Hello");
    }
}