package hexlet.test.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {

    @Test
    public void testSum() {
        var excepted = 6;
        var actual = SomeClass.sum(4, 2);
        assertEquals(excepted, actual);
    }
}
