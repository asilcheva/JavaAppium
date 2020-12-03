package test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assertions.assertTrue(mainClass.getClassNumber()>45, "Actual number is less than 45!");
    }
}
