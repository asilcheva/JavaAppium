package test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        Assertions.assertTrue(mainClass.containsSubstring(), "String doesn't contain Hello or hello");
    }
}
