package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        Assertions.assertEquals(14, mainClass.getLocalNumber(), "Actual number isn't 14!");
    }
}
